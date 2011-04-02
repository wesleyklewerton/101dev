<?php

define('BASE_PATH',str_replace('texgenerator','',dirname(__FILE__)));
$outputShallowFolder = BASE_PATH . "onty/data/shallow/";
$outputDeepFolder = BASE_PATH . "onty/data/deep/";
$dataFolder = BASE_PATH . "onty/data/";

require_once(BASE_PATH . 'API/ApiWrapper2.php');
require_once("commandLine.php");

function getIntetByLevel($level){
  $default = "\\tab";
  for($i = 0; $i <= $level - 1; $i++){
    $default .= "\\tab";
  }
  return $default . "\\tab";
}


function escape($txt){
  $escaped = str_replace("#", "\\#", $txt);
  return $escaped;
}

class OntyGenerator{
  private $catPage;
  
 function __construct($catPage){
    $this->catPage = $catPage;
  }
  
 function generateCategoryFile(){
  
  $categoryFile = "";
  $allCategories = $this->catPage->getFullCategoryTree();
  foreach($allCategories as $cat){
     $symbols = array(" ", "/");
     $fileName = str_replace($symbols, "_", $cat->getTitle());     
     $categoryFile .= "\categoryfile{" . $fileName ."}" . PHP_EOL;
  }
 
  return $categoryFile;
 }
 
 

 function generateShallowTexStructure($catPage){
   $shallowTex = "\\tree{" . $catPage->getTitle() . "}{" . escape($catPage->intent) . "}{\n" ;
   
   foreach($catPage->members as $m){
     $shallowTex .= "\\tab\concept{" . $m->getTitle() . "}{". escape($m->intent) . "}\n";
   }
   
   return $shallowTex;
}
}



$args = CommandLine::parseArgs($_SERVER['argv']);

if($args['mode'] == 'ontology'){ //generate ontology
  echo "entering ontology generation mode, please wait...";
  $tex = "";
  $wiki = new Wiki();
  $base = new CategoryPage("Base");
  $generator = new OntyGenerator($base);
  $categoryFile = $generator->generateCategoryFile();

  $f = fopen($dataFolder . "files.tex", 'w+') or die("can't open file");
  fwrite($f, $categoryFile);
  fclose($f);
  echo PHP_EOL . "generating shallow ontology";
  $allCategories = $base->getFullCategoryTree();
  foreach($allCategories as $cat){
   $tex = $cat->getShallowTex();
   $fileName = $cat->getFileName() . ".tex";
   $f = fopen($outputShallowFolder . $fileName, 'w+') or die("can't open file");
   fwrite($f, $tex);
   fclose($fh);
  }
  
  echo PHP_EOL . "generating deep ontology";
  foreach($allCategories as $cat){
   $tex = $cat->getDeepTex();
  
   $fileName = $cat->getFileName() . ".tex";
   $f = fopen($outputDeepFolder . $fileName, 'w+') or die("can't open file");
   fwrite($f, $tex);
   fclose($fh);
  }
  
}
else if($args['mode'] == 'tex'){ //generate tex wiki pages representation
  $catImpl = new CategoryPage("101implementation");
  $impl = $catImpl->getImplementations();
  var_dump($impl);
}
else{
  die('the following params are supported: --mode:ontology|tex' . PHP_EOL);
}

echo PHP_EOL . "DONE" . PHP_EOL;






