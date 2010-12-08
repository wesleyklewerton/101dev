[Import("mobl"),Load(Path(["mobl","ui","generic.css"])),Load(Path(["mobl","ui","generic","search.png"])),Resource(Path(["mobl","ui","generic","arrow.png"])),Resource(Path(["mobl","ui","generic","contextmenu.png"])),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"header"),[FArg("text"{"text40"},SimpleType(QId("mobl","String"))),FArgOptional("onclick"{"onclick94"},SimpleType(QId("mobl","Callback")),Null)]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"button"),[FArg("text"{"text41"},SimpleType(QId("mobl","String"))),FArgOptional("onclick"{"onclick95"},SimpleType(QId("mobl","Callback")),Null)]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"sideButton"),[FArg("text"{"text42"},SimpleType(QId("mobl","String"))),FArgOptional("onclick"{"onclick96"},SimpleType(QId("mobl","Callback")),Null)]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"backButton"),[FArgOptional("text"{"text43"},SimpleType(QId("mobl","String")),String("\"Back\"")),FArgOptional("onclick"{"onclick97"},SimpleType(QId("mobl","Callback")),Callback([ScreenReturn]))]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"block"),[FArgOptional("cssClass"{"cssClass10"},SimpleType(QId("mobl","String")),Null),FArgOptional("id"{"id10"},SimpleType(QId("mobl","String")),Null),FArgOptional("onclick"{"onclick98"},SimpleType(QId("mobl","Callback")),Null)]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"span"),[FArgOptional("cssClass"{"cssClass11"},SimpleType(QId("mobl","String")),Null),FArgOptional("id"{"id11"},SimpleType(QId("mobl","String")),Null),FArgOptional("onclick"{"onclick99"},SimpleType(QId("mobl","Callback")),Null)]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"group"),[]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"image"),[FArg("url"{"url17"},SimpleType(QId("mobl","String"))),FArgOptional("onclick"{"onclick100"},SimpleType(QId("mobl","Callback")),Null)]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"item"),[FArgOptional("onclick"{"onclick101"},SimpleType(QId("mobl","Callback")),Null),FArgOptional("onswipe"{"onswipe23"},SimpleType(QId("mobl","Callback")),Null)]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"itemArrow"),[FArgOptional("onclick"{"onclick102"},SimpleType(QId("mobl","Callback")),Null),FArgOptional("onswipe"{"onswipe24"},SimpleType(QId("mobl","Callback")),Null)]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"checkBox"),[FArg("b"{"b9"},SimpleType(QId("mobl","Bool"))),FArgOptional("label"{"label23"},SimpleType(QId("mobl","String")),String("\"\""))]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"textField"),[FArg("s"{"s35"},SimpleType(QId("mobl","String"))),FArgOptional("placeholder"{"placeholder31"},SimpleType(QId("mobl","String")),Null),FArgOptional("label"{"label24"},SimpleType(QId("mobl","String")),Null),FArgOptional("onchange"{"onchange22"},SimpleType(QId("mobl","Callback")),Null)]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"numField"),[FArg("n"{"n14"},SimpleType(QId("mobl","Num"))),FArgOptional("placeholder"{"placeholder32"},SimpleType(QId("mobl","String")),Null),FArgOptional("label"{"label25"},SimpleType(QId("mobl","String")),Null),FArgOptional("onchange"{"onchange23"},SimpleType(QId("mobl","Callback")),Null)]),ExternalControl([DocAnno("\"A tabset, takes a list of tuples as argument, e.g. [(\\\"Tab 1\\\", \\\"icon url\\\", tab1), (\\\"Tab 2\\\", \\\"icon uri\\\", tab2)] where tab1 and tab2 are controls with no arguments\"")],QId(QId(QId("mobl","ui"),"generic"),"tabSet"),[FArg("tabs"{"tabs9"},GenericType(QId("mobl","Array"),[GenericType(QId("mobl","Tuple3"),[SimpleType(QId("mobl","String")),SimpleType(QId("mobl","String")),SimpleType(QId("mobl","Control"))])]))]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"searchBox"),[FArg("s"{"s37"},SimpleType(QId("mobl","String"))),FArgOptional("placeholder"{"placeholder33"},SimpleType(QId("mobl","String")),Null),FArgOptional("onsearch"{"onsearch9"},SimpleType(QId("mobl","Callback")),Null)]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"contextMenu"),[]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"masterDetail"),[FArg("items"{"items20"},GenericType(QId("mobl","Collection"),[SimpleType(QId("mobl","Dynamic"))])),FArg("masterItem"{"masterItem15"},GenericType(QId("mobl","Control1"),[SimpleType(QId("mobl","Dynamic"))])),FArg("detail"{"detail15"},GenericType(QId("mobl","Control1"),[SimpleType(QId("mobl","Dynamic"))]))]),ExternalScreen([],QId(QId(QId("mobl","ui"),"generic"),"detailScreen"),[FArg("it"{"it41"},SimpleType(QId("mobl","Dynamic"))),FArg("detail"{"detail16"},GenericType(QId("mobl","Control1"),[SimpleType(QId("mobl","Dynamic"))]))],SimpleType(QId("mobl","void"))),ExternalControl([ConditionalAnno(BinMethodCall(Call(QId("mobl","getScreenWidth"),[]),">",Num("500")))],QId(QId(QId("mobl","ui"),"generic"),"masterDetail"),[FArg("items"{"items21"},GenericType(QId("mobl","Collection"),[SimpleType(QId("mobl","Dynamic"))])),FArg("masterItem"{"masterItem16"},GenericType(QId("mobl","Control1"),[SimpleType(QId("mobl","Dynamic"))])),FArg("detail"{"detail17"},GenericType(QId("mobl","Control1"),[SimpleType(QId("mobl","Dynamic"))]))]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"zoomList"),[FArg("coll"{"coll17"},GenericType(QId("mobl","Collection"),[SimpleType(QId("mobl","Dynamic"))])),FArg("listCtrl"{"listCtrl10"},GenericType(QId("mobl","Control1"),[SimpleType(QId("mobl","Dynamic"))])),FArg("zoomCtrl"{"zoomCtrl5"},GenericType(QId("mobl","Control1"),[SimpleType(QId("mobl","Dynamic"))]))]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"stagedList"),[FArg("coll"{"coll18"},GenericType(QId("mobl","Collection"),[SimpleType(QId("mobl","Dynamic"))])),FArg("listCtrl"{"listCtrl11"},GenericType(QId("mobl","Control1"),[SimpleType(QId("mobl","Dynamic"))])),FArgOptional("initialItems"{"initialItems5"},SimpleType(QId("mobl","Num")),Num("10")),FArgOptional("step"{"step5"},SimpleType(QId("mobl","Num")),Num("10"))]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"markableList"),[FArg("items"{"items22"},GenericType(QId("mobl","Array"),[GenericType(QId("mobl","Tuple2"),[SimpleType(QId("mobl","Bool")),SimpleType(QId("mobl","Dynamic"))])]))]),ExternalScreen([],QId(QId(QId("mobl","ui"),"generic"),"selectList"),[FArg("title"{"title9"},SimpleType(QId("mobl","String"))),FArg("coll"{"coll19"},GenericType(QId("mobl","Collection"),[SimpleType(QId("mobl","Dynamic"))]))],GenericType(QId("mobl","Array"),[SimpleType(QId("mobl","Dynamic"))])),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"searchList"),[FArg("Ent"{"Ent5"},GenericType(QId("mobl","Type"),[GenericType(QId("mobl","Entity"),[SimpleType(QId("mobl","Dynamic"))])])),FArg("masterItem"{"masterItem17"},GenericType(QId("mobl","Control1"),[SimpleType(QId("mobl","Dynamic"))])),FArg("detailItem"{"detailItem5"},GenericType(QId("mobl","Control1"),[SimpleType(QId("mobl","Dynamic"))])),FArgOptional("resultLimit"{"resultLimit5"},SimpleType(QId("mobl","Num")),Num("10"))]),ExternalSyncFunction([],QId(QId(QId("mobl","ui"),"generic"),"startLoading"),[],SimpleType(QId("mobl","void"))),ExternalSyncFunction([],QId(QId(QId("mobl","ui"),"generic"),"endLoading"),[],SimpleType(QId("mobl","void"))),ExternalSyncFunction([],QId(QId(QId("mobl","ui"),"generic"),"setupFloatBox"),[FArg("id",SimpleType(QId("mobl","Num"))),FArgOptional("top",SimpleType(QId("mobl","Num")),Null),FArgOptional("right",SimpleType(QId("mobl","Num")),Null),FArgOptional("bottom",SimpleType(QId("mobl","Num")),Null),FArgOptional("left",SimpleType(QId("mobl","Num")),Null)],SimpleType(QId("mobl","void"))),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"floatBox"),[FArgOptional("top",SimpleType(QId("mobl","Num")),Null),FArgOptional("right",SimpleType(QId("mobl","Num")),Null),FArgOptional("bottom",SimpleType(QId("mobl","Num")),Null),FArgOptional("left",SimpleType(QId("mobl","Num")),Null)]),Resource(Path(["mobl","ui","generic","accordion-down.png"])),Resource(Path(["mobl","ui","generic","accordion-right.png"])),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"accordion"),[FArg("sections"{"sections5"},GenericType(QId("mobl","Array"),[GenericType(QId("mobl","Tuple2"),[SimpleType(QId("mobl","String")),SimpleType(QId("mobl","Control"))])]))]),ExternalControl([DocAnno("\"Renders a table, use row { } rows and cell { } for cells\"")],QId(QId(QId("mobl","ui"),"generic"),"table"),[]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"row"),[]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"cell"),[FArgOptional("width"{"width19"},SimpleType(QId("mobl","String")),Null)]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"col"),[FArgOptional("width"{"width20"},SimpleType(QId("mobl","String")),Null)]),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"headerCol"),[FArgOptional("width"{"width21"},SimpleType(QId("mobl","String")),Null)]),ExternalSyncFunction([],QId(QId(QId("mobl","ui"),"generic"),"setupScrollers"),[],SimpleType(QId("mobl","void"))),ExternalSyncFunction([],QId(QId(QId("mobl","ui"),"generic"),"scrollUp"),[],SimpleType(QId("mobl","void"))),ExternalControl([],QId(QId(QId("mobl","ui"),"generic"),"scroller"),[FArgOptional("height"{"height5"},SimpleType(QId("mobl","Num")),Num("200"))])]