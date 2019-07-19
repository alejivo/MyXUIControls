package b4a.MyXUIControls;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xsearchtemplate_subs_0 {


public static RemoteObject  _additemstolist(RemoteObject __ref,RemoteObject _li,RemoteObject _full) throws Exception{
try {
		Debug.PushSubsStack("AddItemsToList (b4xsearchtemplate) ","b4xsearchtemplate",16,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("additemstolist")) { return __ref.runUserSub(false, "b4xsearchtemplate","additemstolist", __ref, _li, _full);}
int _i = 0;
RemoteObject _item = RemoteObject.createImmutable("");
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _pnlcolor = RemoteObject.createImmutable(0);
RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("li", _li);
Debug.locals.put("full", _full);
 BA.debugLineNum = 121;BA.debugLine="Private Sub AddItemsToList(li As List, full As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="If li.IsInitialized = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_li.runMethod(true,"IsInitialized"),b4xsearchtemplate.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 127;BA.debugLine="For i = 0 To li.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_li.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 128;BA.debugLine="If CustomListView1.Size >= MaxNumberOfItemsToSho";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getsize"),BA.numberCast(double.class, __ref.getField(true,"_maxnumberofitemstoshow" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 129;BA.debugLine="Dim item As String = li.Get(i)";
Debug.JustUpdateDeviceLine();
_item = BA.ObjectToString(_li.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 130;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
Debug.JustUpdateDeviceLine();
_x = _item.runMethod(true,"toLowerCase").runMethod(true,"indexOf",(Object)(_full));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 131;BA.debugLine="If x = -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_x,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 132;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 BA.debugLineNum = 134;BA.debugLine="Dim pnlColor As Int";
Debug.JustUpdateDeviceLine();
_pnlcolor = RemoteObject.createImmutable(0);Debug.locals.put("pnlColor", _pnlcolor);
 BA.debugLineNum = 135;BA.debugLine="If CustomListView1.Size = 0 And full.Length > 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getsize"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_full.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
_pnlcolor = __ref.getField(true,"_itemhightlightcolor" /*RemoteObject*/ );Debug.locals.put("pnlColor", _pnlcolor);}
else {
_pnlcolor = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(true,"_defaulttextbackgroundcolor");Debug.locals.put("pnlColor", _pnlcolor);};
 BA.debugLineNum = 137;BA.debugLine="Dim cs As CSBuilder";
Debug.JustUpdateDeviceLine();
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 138;BA.debugLine="cs.Initialize.Append(item.SubString2(0, x)).Colo";
Debug.JustUpdateDeviceLine();
_cs.runMethod(false,"Initialize").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(_item.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_x))))).runMethod(false,"Color",(Object)(__ref.getField(true,"_texthighlightcolor" /*RemoteObject*/ ))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(_item.runMethod(true,"substring",(Object)(_x),(Object)(RemoteObject.solve(new RemoteObject[] {_x,_full.runMethod(true,"length")}, "+",1, 1)))))).runVoidMethod ("Pop");
 BA.debugLineNum = 139;BA.debugLine="cs.Append(item.SubString(x + full.Length))";
Debug.JustUpdateDeviceLine();
_cs.runVoidMethod ("Append",(Object)(BA.ObjectToCharSequence(_item.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_x,_full.runMethod(true,"length")}, "+",1, 1))))));
 BA.debugLineNum = 140;BA.debugLine="If ItemsCache.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_itemscache" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 141;BA.debugLine="Dim p As B4XView = ItemsCache.Get(ItemsCache.Si";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p.setObject(__ref.getField(false,"_itemscache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_itemscache" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("p", _p);
 BA.debugLineNum = 142;BA.debugLine="ItemsCache.RemoveAt(ItemsCache.Size - 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_itemscache" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_itemscache" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 144;BA.debugLine="p.GetView(0).Text = cs";
Debug.JustUpdateDeviceLine();
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setText",BA.ObjectToCharSequence(_cs.getObject()));
 BA.debugLineNum = 149;BA.debugLine="p.Color = pnlColor";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setColor",_pnlcolor);
 BA.debugLineNum = 150;BA.debugLine="CustomListView1.Add(p, item)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_p),(Object)((_item)));
 }else {
 BA.debugLineNum = 152;BA.debugLine="CustomListView1.AddTextItem(cs, item)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)((_cs.getObject())),(Object)((_item)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 173;BA.debugLine="For i = 0 To li.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {_li.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24) ;_i = ((int)(0 + _i + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 174;BA.debugLine="Dim item As String = li.Get(i)";
Debug.JustUpdateDeviceLine();
_item = BA.ObjectToString(_li.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 175;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
Debug.JustUpdateDeviceLine();
_x = _item.runMethod(true,"toLowerCase").runMethod(true,"indexOf",(Object)(_full));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 176;BA.debugLine="If x = -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_x,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 177;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
b4xsearchtemplate._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xsearchtemplate._xui);
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView";
b4xsearchtemplate._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xsearchtemplate._mbase);
 //BA.debugLineNum = 4;BA.debugLine="Public CustomListView1 As CustomListView";
b4xsearchtemplate._customlistview1 = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_customlistview1",b4xsearchtemplate._customlistview1);
 //BA.debugLineNum = 5;BA.debugLine="Private xDialog As B4XDialog";
b4xsearchtemplate._xdialog = RemoteObject.createNew ("b4a.MyXUIControls.b4xdialog");__ref.setField("_xdialog",b4xsearchtemplate._xdialog);
 //BA.debugLineNum = 6;BA.debugLine="Public SearchField As B4XFloatTextField";
b4xsearchtemplate._searchfield = RemoteObject.createNew ("b4a.MyXUIControls.b4xfloattextfield");__ref.setField("_searchfield",b4xsearchtemplate._searchfield);
 //BA.debugLineNum = 7;BA.debugLine="Private prefixList As Map";
b4xsearchtemplate._prefixlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_prefixlist",b4xsearchtemplate._prefixlist);
 //BA.debugLineNum = 8;BA.debugLine="Private substringList As Map";
b4xsearchtemplate._substringlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_substringlist",b4xsearchtemplate._substringlist);
 //BA.debugLineNum = 9;BA.debugLine="Public TextHighlightColor As Int = 0xFFFD5C5C";
b4xsearchtemplate._texthighlightcolor = BA.numberCast(int.class, 0xfffd5c5c);__ref.setField("_texthighlightcolor",b4xsearchtemplate._texthighlightcolor);
 //BA.debugLineNum = 10;BA.debugLine="Public ItemHightlightColor As Int = 0x7E008EFF";
b4xsearchtemplate._itemhightlightcolor = BA.numberCast(int.class, 0x7e008eff);__ref.setField("_itemhightlightcolor",b4xsearchtemplate._itemhightlightcolor);
 //BA.debugLineNum = 11;BA.debugLine="Private MAX_LIMIT = 4 As Int";
b4xsearchtemplate._max_limit = BA.numberCast(int.class, 4);__ref.setField("_max_limit",b4xsearchtemplate._max_limit);
 //BA.debugLineNum = 12;BA.debugLine="Public MaxNumberOfItemsToShow As Int = 100";
b4xsearchtemplate._maxnumberofitemstoshow = BA.numberCast(int.class, 100);__ref.setField("_maxnumberofitemstoshow",b4xsearchtemplate._maxnumberofitemstoshow);
 //BA.debugLineNum = 13;BA.debugLine="Private ItemsCache As List";
b4xsearchtemplate._itemscache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_itemscache",b4xsearchtemplate._itemscache);
 //BA.debugLineNum = 14;BA.debugLine="Private AllItems As List";
b4xsearchtemplate._allitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_allitems",b4xsearchtemplate._allitems);
 //BA.debugLineNum = 15;BA.debugLine="Public SelectedItem As String";
b4xsearchtemplate._selecteditem = RemoteObject.createImmutable("");__ref.setField("_selecteditem",b4xsearchtemplate._selecteditem);
 //BA.debugLineNum = 16;BA.debugLine="Private LastTerm As String";
b4xsearchtemplate._lastterm = RemoteObject.createImmutable("");__ref.setField("_lastterm",b4xsearchtemplate._lastterm);
 //BA.debugLineNum = 18;BA.debugLine="Private IME As IME";
b4xsearchtemplate._ime = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_ime",b4xsearchtemplate._ime);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _customlistview1_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CustomListView1_ItemClick (b4xsearchtemplate) ","b4xsearchtemplate",16,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("customlistview1_itemclick")) { return __ref.runUserSub(false, "b4xsearchtemplate","customlistview1_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 115;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="If Value = \"\" Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 117;BA.debugLine="SelectedItem = Value";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selecteditem" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 118;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xdialog" /*RemoteObject*/ ).runClassMethod (b4a.MyXUIControls.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogclosed(RemoteObject __ref,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("DialogClosed (b4xsearchtemplate) ","b4xsearchtemplate",16,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("dialogclosed")) { return __ref.runUserSub(false, "b4xsearchtemplate","dialogclosed", __ref, _result);}
Debug.locals.put("Result", _result);
 BA.debugLineNum = 231;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (b4xsearchtemplate) ","b4xsearchtemplate",16,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "b4xsearchtemplate","getpanel", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 57;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xsearchtemplate) ","b4xsearchtemplate",16,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xsearchtemplate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase"))));
 BA.debugLineNum = 25;BA.debugLine="Dim height As Int";
Debug.JustUpdateDeviceLine();
_height = RemoteObject.createImmutable(0);Debug.locals.put("height", _height);
 BA.debugLineNum = 26;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then height = 220dip El";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A")) || RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i"))) { 
_height = b4xsearchtemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 220)));Debug.locals.put("height", _height);}
else {
_height = b4xsearchtemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)));Debug.locals.put("height", _height);};
 BA.debugLineNum = 27;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xsearchtemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))),(Object)(_height));
 BA.debugLineNum = 28;BA.debugLine="mBase.LoadLayout(\"SearchTemplate\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("SearchTemplate")),__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 30;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 31;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",BA.numberCast(int.class, 0xff555555));
 BA.debugLineNum = 32;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextcolor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 42;BA.debugLine="ItemsCache.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_itemscache" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="prefixList.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefixlist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="substringList.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_substringlist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="IME.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 47;BA.debugLine="Dim jo As JavaObject = SearchField.TextField";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(__ref.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (b4a.MyXUIControls.b4xfloattextfield.class, "_gettextfield" /*RemoteObject*/ ).getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 48;BA.debugLine="jo.RunMethod(\"setImeOptions\", Array(Bit.Or(335544";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setImeOptions")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(b4xsearchtemplate.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, 33554432)),(Object)(BA.numberCast(int.class, 6))))})));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Resize (b4xsearchtemplate) ","b4xsearchtemplate",16,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("resize")) { return __ref.runUserSub(false, "b4xsearchtemplate","resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 52;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 54;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_base_resize",(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _searchfield_enterpressed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SearchField_EnterPressed (b4xsearchtemplate) ","b4xsearchtemplate",16,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("searchfield_enterpressed")) { return __ref.runUserSub(false, "b4xsearchtemplate","searchfield_enterpressed", __ref);}
 BA.debugLineNum = 108;BA.debugLine="Private Sub SearchField_EnterPressed";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="If CustomListView1.Size > 0 And LastTerm.Length >";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getsize"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",__ref.getField(true,"_lastterm" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 110;BA.debugLine="CustomListView1_ItemClick(0, CustomListView1.Get";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.MyXUIControls.b4xsearchtemplate.class, "_customlistview1_itemclick" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, 0)))));
 };
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _searchfield_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("SearchField_TextChanged (b4xsearchtemplate) ","b4xsearchtemplate",16,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("searchfield_textchanged")) { return __ref.runUserSub(false, "b4xsearchtemplate","searchfield_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 77;BA.debugLine="Private Sub SearchField_TextChanged (Old As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="Update(New, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.MyXUIControls.b4xsearchtemplate.class, "_update" /*RemoteObject*/ ,(Object)(_new),(Object)(b4xsearchtemplate.__c.getField(true,"False")));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setindex(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("SetIndex (b4xsearchtemplate) ","b4xsearchtemplate",16,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("setindex")) { return __ref.runUserSub(false, "b4xsearchtemplate","setindex", __ref, _index);}
RemoteObject _obj = null;
Debug.locals.put("Index", _index);
 BA.debugLineNum = 223;BA.debugLine="Public Sub SetIndex(Index As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 224;BA.debugLine="Dim obj() As Object";
Debug.JustUpdateDeviceLine();
_obj = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});Debug.locals.put("obj", _obj);
 BA.debugLineNum = 225;BA.debugLine="obj = Index";
Debug.JustUpdateDeviceLine();
_obj = (_index);Debug.locals.put("obj", _obj);
 BA.debugLineNum = 226;BA.debugLine="prefixList = obj(0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefixlist" /*RemoteObject*/ ).setObject (_obj.getArrayElement(false,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 227;BA.debugLine="substringList = obj(1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_substringlist" /*RemoteObject*/ ).setObject (_obj.getArrayElement(false,BA.numberCast(int.class, 1)));
 BA.debugLineNum = 228;BA.debugLine="AllItems = obj(2)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_allitems" /*RemoteObject*/ ).setObject (_obj.getArrayElement(false,BA.numberCast(int.class, 2)));
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setitems(RemoteObject __ref,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("SetItems (b4xsearchtemplate) ","b4xsearchtemplate",16,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("setitems")) { return __ref.runUserSub(false, "b4xsearchtemplate","setitems", __ref, _items);}
RemoteObject _starttime = RemoteObject.createImmutable(0L);
RemoteObject _noduplicates = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _li = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _item = RemoteObject.createImmutable("");
int _start = 0;
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("Items", _items);
 BA.debugLineNum = 184;BA.debugLine="Public Sub SetItems(Items As List) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 185;BA.debugLine="Dim startTime As Long";
Debug.JustUpdateDeviceLine();
_starttime = RemoteObject.createImmutable(0L);Debug.locals.put("startTime", _starttime);
 BA.debugLineNum = 186;BA.debugLine="startTime = DateTime.Now";
Debug.JustUpdateDeviceLine();
_starttime = b4xsearchtemplate.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("startTime", _starttime);
 BA.debugLineNum = 187;BA.debugLine="Dim noDuplicates As Map";
Debug.JustUpdateDeviceLine();
_noduplicates = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("noDuplicates", _noduplicates);
 BA.debugLineNum = 188;BA.debugLine="noDuplicates.Initialize";
Debug.JustUpdateDeviceLine();
_noduplicates.runVoidMethod ("Initialize");
 BA.debugLineNum = 189;BA.debugLine="prefixList.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefixlist" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 190;BA.debugLine="substringList.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_substringlist" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 191;BA.debugLine="Dim m As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 192;BA.debugLine="Dim li As List";
Debug.JustUpdateDeviceLine();
_li = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("li", _li);
 BA.debugLineNum = 193;BA.debugLine="For i = 0 To Items.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 194;BA.debugLine="Dim item As String";
Debug.JustUpdateDeviceLine();
_item = RemoteObject.createImmutable("");Debug.locals.put("item", _item);
 BA.debugLineNum = 195;BA.debugLine="item = Items.Get(i)";
Debug.JustUpdateDeviceLine();
_item = BA.ObjectToString(_items.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);
 BA.debugLineNum = 196;BA.debugLine="item = item.ToLowerCase";
Debug.JustUpdateDeviceLine();
_item = _item.runMethod(true,"toLowerCase");Debug.locals.put("item", _item);
 BA.debugLineNum = 197;BA.debugLine="noDuplicates.Clear";
Debug.JustUpdateDeviceLine();
_noduplicates.runVoidMethod ("Clear");
 BA.debugLineNum = 198;BA.debugLine="For start = 0 To item.Length";
Debug.JustUpdateDeviceLine();
{
final int step14 = 1;
final int limit14 = _item.runMethod(true,"length").<Integer>get().intValue();
_start = 0 ;
for (;(step14 > 0 && _start <= limit14) || (step14 < 0 && _start >= limit14) ;_start = ((int)(0 + _start + step14))  ) {
Debug.locals.put("start", _start);
 BA.debugLineNum = 199;BA.debugLine="Dim count As Int = 1";
Debug.JustUpdateDeviceLine();
_count = BA.numberCast(int.class, 1);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 200;BA.debugLine="Do While count <= MAX_LIMIT And start + count <";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("k",_count,BA.numberCast(double.class, __ref.getField(true,"_max_limit" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("k",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_start),_count}, "+",1, 1),BA.numberCast(double.class, _item.runMethod(true,"length")))) {
 BA.debugLineNum = 201;BA.debugLine="Dim str As String";
Debug.JustUpdateDeviceLine();
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 202;BA.debugLine="str = item.SubString2(start, start + count)";
Debug.JustUpdateDeviceLine();
_str = _item.runMethod(true,"substring",(Object)(BA.numberCast(int.class, _start)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_start),_count}, "+",1, 1)));Debug.locals.put("str", _str);
 BA.debugLineNum = 203;BA.debugLine="If noDuplicates.ContainsKey(str) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_noduplicates.runMethod(true,"ContainsKey",(Object)((_str))),b4xsearchtemplate.__c.getField(true,"False"))) { 
 BA.debugLineNum = 204;BA.debugLine="noDuplicates.Put(str, \"\")";
Debug.JustUpdateDeviceLine();
_noduplicates.runVoidMethod ("Put",(Object)((_str)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 205;BA.debugLine="If start = 0 Then m = prefixList Else m = sub";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_start),BA.numberCast(double.class, 0))) { 
_m = __ref.getField(false,"_prefixlist" /*RemoteObject*/ );Debug.locals.put("m", _m);}
else {
_m = __ref.getField(false,"_substringlist" /*RemoteObject*/ );Debug.locals.put("m", _m);};
 BA.debugLineNum = 206;BA.debugLine="li = m.Get(str)";
Debug.JustUpdateDeviceLine();
_li.setObject(_m.runMethod(false,"Get",(Object)((_str))));
 BA.debugLineNum = 207;BA.debugLine="If li.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_li.runMethod(true,"IsInitialized"),b4xsearchtemplate.__c.getField(true,"False"))) { 
 BA.debugLineNum = 208;BA.debugLine="li.Initialize";
Debug.JustUpdateDeviceLine();
_li.runVoidMethod ("Initialize");
 BA.debugLineNum = 209;BA.debugLine="m.Put(str, li)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_str)),(Object)((_li.getObject())));
 };
 BA.debugLineNum = 211;BA.debugLine="li.Add(Items.Get(i)) 'Preserve the original c";
Debug.JustUpdateDeviceLine();
_li.runVoidMethod ("Add",(Object)(_items.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 };
 BA.debugLineNum = 213;BA.debugLine="count = count + 1";
Debug.JustUpdateDeviceLine();
_count = RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count", _count);
 }
;
 }
}Debug.locals.put("start", _start);
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 217;BA.debugLine="Log(\"Index time: \" & (DateTime.Now - startTime) &";
Debug.JustUpdateDeviceLine();
b4xsearchtemplate.__c.runVoidMethod ("LogImpl","914155809",RemoteObject.concat(RemoteObject.createImmutable("Index time: "),(RemoteObject.solve(new RemoteObject[] {b4xsearchtemplate.__c.getField(false,"DateTime").runMethod(true,"getNow"),_starttime}, "-",1, 2)),RemoteObject.createImmutable(" ms ("),_items.runMethod(true,"getSize"),RemoteObject.createImmutable(" Items)")),0);
 BA.debugLineNum = 218;BA.debugLine="AllItems = Items";
Debug.JustUpdateDeviceLine();
__ref.setField ("_allitems" /*RemoteObject*/ ,_items);
 BA.debugLineNum = 219;BA.debugLine="Return Array(prefixList, substringList, AllItems)";
Debug.JustUpdateDeviceLine();
if (true) return (RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(__ref.getField(false,"_prefixlist" /*RemoteObject*/ ).getObject()),(__ref.getField(false,"_substringlist" /*RemoteObject*/ ).getObject()),(__ref.getField(false,"_allitems" /*RemoteObject*/ ).getObject())}));
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _show(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xsearchtemplate) ","b4xsearchtemplate",16,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "b4xsearchtemplate","show", __ref, _dialog); return;}
ResumableSub_Show rsub = new ResumableSub_Show(null,__ref,_dialog);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.MyXUIControls.b4xsearchtemplate parent,RemoteObject __ref,RemoteObject _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.MyXUIControls.b4xsearchtemplate parent;
RemoteObject _dialog;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xsearchtemplate) ","b4xsearchtemplate",16,__ref.getField(false, "ba"),__ref,61);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 62;BA.debugLine="xDialog = Dialog";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xdialog" /*RemoteObject*/ ,_dialog);
 BA.debugLineNum = 63;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xdialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A")) || RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i"))));
 BA.debugLineNum = 64;BA.debugLine="CustomListView1.AsView.Color = xui.Color_Transpar";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 65;BA.debugLine="CustomListView1.sv.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 66;BA.debugLine="mBase.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 67;BA.debugLine="Sleep(20)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xsearchtemplate", "show"),BA.numberCast(int.class, 20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 68;BA.debugLine="Update(\"\", True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.MyXUIControls.b4xsearchtemplate.class, "_update" /*RemoteObject*/ ,(Object)(BA.ObjectToString("")),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 69;BA.debugLine="CustomListView1.JumpToItem(0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 70;BA.debugLine="SearchField.Text = \"\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (b4a.MyXUIControls.b4xfloattextfield.class, "_settext" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 71;BA.debugLine="SearchField.TextField.RequestFocus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (b4a.MyXUIControls.b4xfloattextfield.class, "_gettextfield" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 73;BA.debugLine="IME.ShowKeyboard(SearchField.TextField)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("ShowKeyboard",(Object)((__ref.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (b4a.MyXUIControls.b4xfloattextfield.class, "_gettextfield" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _term,RemoteObject _force) throws Exception{
try {
		Debug.PushSubsStack("Update (b4xsearchtemplate) ","b4xsearchtemplate",16,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "b4xsearchtemplate","update", __ref, _term, _force);}
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _str1 = RemoteObject.createImmutable("");
RemoteObject _str2 = RemoteObject.createImmutable("");
Debug.locals.put("Term", _term);
Debug.locals.put("Force", _force);
 BA.debugLineNum = 81;BA.debugLine="Private Sub Update(Term As String, Force As Boolea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="If Term = LastTerm And Force = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_term,__ref.getField(true,"_lastterm" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_force,b4xsearchtemplate.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 83;BA.debugLine="LastTerm = Term";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastterm" /*RemoteObject*/ ,_term);
 BA.debugLineNum = 84;BA.debugLine="If xui.IsB4J = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J"),b4xsearchtemplate.__c.getField(true,"False"))) { 
 BA.debugLineNum = 85;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 86;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 87;BA.debugLine="p.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 88;BA.debugLine="ItemsCache.Add(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_itemscache" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_p.getObject())));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 91;BA.debugLine="CustomListView1.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 93;BA.debugLine="Dim str1, str2 As String";
Debug.JustUpdateDeviceLine();
_str1 = RemoteObject.createImmutable("");Debug.locals.put("str1", _str1);
_str2 = RemoteObject.createImmutable("");Debug.locals.put("str2", _str2);
 BA.debugLineNum = 94;BA.debugLine="str1 = Term.ToLowerCase";
Debug.JustUpdateDeviceLine();
_str1 = _term.runMethod(true,"toLowerCase");Debug.locals.put("str1", _str1);
 BA.debugLineNum = 95;BA.debugLine="If Term = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_term,BA.ObjectToString(""))) { 
 BA.debugLineNum = 96;BA.debugLine="AddItemsToList(AllItems, str1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.MyXUIControls.b4xsearchtemplate.class, "_additemstolist" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_allitems" /*RemoteObject*/ )),(Object)(_str1));
 }else {
 BA.debugLineNum = 98;BA.debugLine="If str1.Length > MAX_LIMIT Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_str1.runMethod(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_max_limit" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 99;BA.debugLine="str2 = str1.SubString2(0, MAX_LIMIT)";
Debug.JustUpdateDeviceLine();
_str2 = _str1.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_max_limit" /*RemoteObject*/ )));Debug.locals.put("str2", _str2);
 }else {
 BA.debugLineNum = 101;BA.debugLine="str2 = str1";
Debug.JustUpdateDeviceLine();
_str2 = _str1;Debug.locals.put("str2", _str2);
 };
 BA.debugLineNum = 103;BA.debugLine="AddItemsToList(prefixList.Get(str2), str1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.MyXUIControls.b4xsearchtemplate.class, "_additemstolist" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_prefixlist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_str2)))),(Object)(_str1));
 BA.debugLineNum = 104;BA.debugLine="AddItemsToList(substringList.Get(str2), str1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.MyXUIControls.b4xsearchtemplate.class, "_additemstolist" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_substringlist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_str2)))),(Object)(_str1));
 };
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}