package b4a.MyXUIControls;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xuiimagebutton_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "xuiimagebutton","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 181;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _centerallcontent(RemoteObject __ref,RemoteObject _lbl) throws Exception{
try {
		Debug.PushSubsStack("CenterAllContent (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("centerallcontent")) { return __ref.runUserSub(false, "xuiimagebutton","centerallcontent", __ref, _lbl);}
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _contentsize = RemoteObject.createImmutable(0);
RemoteObject _startpoint = RemoteObject.createImmutable(0);
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 44;BA.debugLine="Private Sub CenterAllContent(lbl As Label)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="cmdButton = objXUI.CreatePanel(\"cmdButton\")";
Debug.ShouldStop(8192);
__ref.setField ("_cmdbutton" /*RemoteObject*/ ,__ref.getField(false,"_objxui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("cmdButton"))));
 BA.debugLineNum = 47;BA.debugLine="cmdButton.Height = mBase.Height";
Debug.ShouldStop(16384);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 48;BA.debugLine="cmdButton.Width = mBase.Width";
Debug.ShouldStop(32768);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 51;BA.debugLine="imgIcon = CreateImageView(\"imgIcon\")";
Debug.ShouldStop(262144);
__ref.setField ("_imgicon" /*RemoteObject*/ ,__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_createimageview" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("imgIcon"))));
 BA.debugLineNum = 52;BA.debugLine="If ImageFileName <> \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_imagefilename" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 53;BA.debugLine="imgIcon.Height = cmdButton.Height-Margin*2";
Debug.ShouldStop(1048576);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1));
 BA.debugLineNum = 54;BA.debugLine="imgIcon.Width = cmdButton.Height-Margin*2";
Debug.ShouldStop(2097152);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1));
 BA.debugLineNum = 55;BA.debugLine="Dim image As Bitmap = LoadBitmap(File.DirAssets,";
Debug.ShouldStop(4194304);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_image = xuiimagebutton.__c.runMethod(false,"LoadBitmap",(Object)(xuiimagebutton.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(__ref.getField(true,"_imagefilename" /*RemoteObject*/ )));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 56;BA.debugLine="imgIcon.SetBitmap(image.Resize(imgIcon.Width, im";
Debug.ShouldStop(8388608);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_image.runMethod(false,"Resize",(Object)(BA.numberCast(float.class, __ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getHeight"))),(Object)(xuiimagebutton.__c.getField(true,"True"))).getObject())));
 }else {
 BA.debugLineNum = 58;BA.debugLine="imgIcon.Height = 0";
Debug.ShouldStop(33554432);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 59;BA.debugLine="imgIcon.Width = 0";
Debug.ShouldStop(67108864);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 63;BA.debugLine="lblButton = CreateLabel(\"lblButton\", lbl)";
Debug.ShouldStop(1073741824);
__ref.setField ("_lblbutton" /*RemoteObject*/ ,__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("lblButton")),(Object)(_lbl)));
 BA.debugLineNum = 64;BA.debugLine="lblButton.Height = cmdButton.Height-Margin*2";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1));
 BA.debugLineNum = 65;BA.debugLine="lblButton.Width = cmdButton.Width-imgIcon.Width-L";
Debug.ShouldStop(1);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_labelmargin" /*RemoteObject*/ ),__ref.getField(true,"_leftmargin" /*RemoteObject*/ )}, "---",3, 1));
 BA.debugLineNum = 66;BA.debugLine="Log(MeasureTextWidth(lblButton.Text, lblButton.Fo";
Debug.ShouldStop(2);
xuiimagebutton.__c.runVoidMethod ("LogImpl","0983062",BA.NumberToString(__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_measuretextwidth" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(false,"getFont")))),0);
 BA.debugLineNum = 67;BA.debugLine="lblButton.Width = MeasureTextWidth(lblButton.Text";
Debug.ShouldStop(4);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_measuretextwidth" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(false,"getFont"))));
 BA.debugLineNum = 68;BA.debugLine="lblButton.SetTextAlignment(\"CENTER\", TextAligment";
Debug.ShouldStop(8);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(__ref.getField(true,"_textaligment" /*RemoteObject*/ )));
 BA.debugLineNum = 72;BA.debugLine="Dim ContentSize As Int = imgIcon.Width+Margin+lbl";
Debug.ShouldStop(128);
_contentsize = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_margin" /*RemoteObject*/ ),__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "++",2, 1);Debug.locals.put("ContentSize", _contentsize);Debug.locals.put("ContentSize", _contentsize);
 BA.debugLineNum = 73;BA.debugLine="Dim StartPoint As Int = (cmdButton.Width-ContentS";
Debug.ShouldStop(256);
_startpoint = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getWidth"),_contentsize}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("StartPoint", _startpoint);Debug.locals.put("StartPoint", _startpoint);
 BA.debugLineNum = 77;BA.debugLine="cmdButton.AddView(imgIcon,StartPoint,Margin, imgI";
Debug.ShouldStop(4096);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imgicon" /*RemoteObject*/ ).getObject())),(Object)(_startpoint),(Object)(__ref.getField(true,"_margin" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 78;BA.debugLine="cmdButton.AddView(lblButton,imgIcon.Left+imgIcon.";
Debug.ShouldStop(8192);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_labelmargin" /*RemoteObject*/ )}, "++",2, 1)),(Object)(__ref.getField(true,"_margin" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 81;BA.debugLine="mBase.AddView(cmdButton,0dip,0dip,mBase.Width,mBa";
Debug.ShouldStop(65536);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).getObject())),(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 82;BA.debugLine="mBase.Color = objXUI.PaintOrColorToColor(BaseColo";
Debug.ShouldStop(131072);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_objxui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(__ref.getField(false,"_basecolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private mEventName As String 'ignore";
xuiimagebutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",xuiimagebutton._meventname);
 //BA.debugLineNum = 14;BA.debugLine="Private mCallBack As Object 'ignore";
xuiimagebutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",xuiimagebutton._mcallback);
 //BA.debugLineNum = 15;BA.debugLine="Private mBase As B4XView 'ignore";
xuiimagebutton._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",xuiimagebutton._mbase);
 //BA.debugLineNum = 16;BA.debugLine="Private objXUI As XUI 'ignore";
xuiimagebutton._objxui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_objxui",xuiimagebutton._objxui);
 //BA.debugLineNum = 17;BA.debugLine="Private imgIcon As B4XView";
xuiimagebutton._imgicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_imgicon",xuiimagebutton._imgicon);
 //BA.debugLineNum = 18;BA.debugLine="Private lblButton As B4XView";
xuiimagebutton._lblbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblbutton",xuiimagebutton._lblbutton);
 //BA.debugLineNum = 19;BA.debugLine="Private cmdButton As B4XView";
xuiimagebutton._cmdbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_cmdbutton",xuiimagebutton._cmdbutton);
 //BA.debugLineNum = 21;BA.debugLine="Private Margin,PressDelay,LeftMargin, LabelMargin";
xuiimagebutton._margin = RemoteObject.createImmutable(0);__ref.setField("_margin",xuiimagebutton._margin);
xuiimagebutton._pressdelay = RemoteObject.createImmutable(0);__ref.setField("_pressdelay",xuiimagebutton._pressdelay);
xuiimagebutton._leftmargin = RemoteObject.createImmutable(0);__ref.setField("_leftmargin",xuiimagebutton._leftmargin);
xuiimagebutton._labelmargin = RemoteObject.createImmutable(0);__ref.setField("_labelmargin",xuiimagebutton._labelmargin);
 //BA.debugLineNum = 22;BA.debugLine="Private ImageFileName,TextAligment, Aligment  As";
xuiimagebutton._imagefilename = RemoteObject.createImmutable("");__ref.setField("_imagefilename",xuiimagebutton._imagefilename);
xuiimagebutton._textaligment = RemoteObject.createImmutable("");__ref.setField("_textaligment",xuiimagebutton._textaligment);
xuiimagebutton._aligment = RemoteObject.createImmutable("");__ref.setField("_aligment",xuiimagebutton._aligment);
 //BA.debugLineNum = 23;BA.debugLine="Private PressedColor, BaseColor As Object";
xuiimagebutton._pressedcolor = RemoteObject.createNew ("Object");__ref.setField("_pressedcolor",xuiimagebutton._pressedcolor);
xuiimagebutton._basecolor = RemoteObject.createNew ("Object");__ref.setField("_basecolor",xuiimagebutton._basecolor);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _cmdbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdButton_Click (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("cmdbutton_click")) { __ref.runUserSub(false, "xuiimagebutton","cmdbutton_click", __ref); return;}
ResumableSub_cmdButton_Click rsub = new ResumableSub_cmdButton_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdButton_Click extends BA.ResumableSub {
public ResumableSub_cmdButton_Click(b4a.MyXUIControls.xuiimagebutton parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.MyXUIControls.xuiimagebutton parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdButton_Click (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,173);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 174;BA.debugLine="mBase.Color = objXUI.PaintOrColorToColor(PressedC";
Debug.ShouldStop(8192);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_objxui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(__ref.getField(false,"_pressedcolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 175;BA.debugLine="Sleep(PressDelay)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "xuiimagebutton", "cmdbutton_click"),__ref.getField(true,"_pressdelay" /*RemoteObject*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 176;BA.debugLine="mBase.Color = objXUI.PaintOrColorToColor(BaseColo";
Debug.ShouldStop(32768);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_objxui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(__ref.getField(false,"_basecolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 177;BA.debugLine="If SubExists(mCallBack,mEventName&\"_Click\") Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Click")))).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Click"))));
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static RemoteObject  _createimageview(RemoteObject __ref,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("CreateImageView (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("createimageview")) { return __ref.runUserSub(false, "xuiimagebutton","createimageview", __ref, _eventname);}
RemoteObject _tmp_imgv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 167;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
Debug.ShouldStop(64);
 BA.debugLineNum = 168;BA.debugLine="Dim tmp_imgv As ImageView";
Debug.ShouldStop(128);
_tmp_imgv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("tmp_imgv", _tmp_imgv);
 BA.debugLineNum = 169;BA.debugLine="tmp_imgv.Initialize(EventName)";
Debug.ShouldStop(256);
_tmp_imgv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 170;BA.debugLine="Return tmp_imgv";
Debug.ShouldStop(512);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _tmp_imgv.getObject());
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _eventname,RemoteObject _lbl) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "xuiimagebutton","createlabel", __ref, _eventname, _lbl);}
RemoteObject _tmp_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("EventName", _eventname);
Debug.locals.put("Lbl", _lbl);
 BA.debugLineNum = 155;BA.debugLine="Private Sub CreateLabel(EventName As String, Lbl A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="Dim tmp_lbl As Label";
Debug.ShouldStop(134217728);
_tmp_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("tmp_lbl", _tmp_lbl);
 BA.debugLineNum = 157;BA.debugLine="tmp_lbl.Initialize(EventName)";
Debug.ShouldStop(268435456);
_tmp_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 158;BA.debugLine="tmp_lbl.SingleLine = True";
Debug.ShouldStop(536870912);
_tmp_lbl.runVoidMethod ("setSingleLine",xuiimagebutton.__c.getField(true,"True"));
 BA.debugLineNum = 160;BA.debugLine="tmp_lbl.Typeface = Lbl.Typeface";
Debug.ShouldStop(-2147483648);
_tmp_lbl.runMethod(false,"setTypeface",_lbl.runMethod(false,"getTypeface"));
 BA.debugLineNum = 161;BA.debugLine="tmp_lbl.Text = Lbl.Text";
Debug.ShouldStop(1);
_tmp_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_lbl.runMethod(true,"getText")));
 BA.debugLineNum = 162;BA.debugLine="tmp_lbl.TextColor = Lbl.TextColor";
Debug.ShouldStop(2);
_tmp_lbl.runMethod(true,"setTextColor",_lbl.runMethod(true,"getTextColor"));
 BA.debugLineNum = 164;BA.debugLine="Return tmp_lbl";
Debug.ShouldStop(8);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _tmp_lbl.getObject());
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "xuiimagebutton","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 32;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="mBase = Base";
Debug.ShouldStop(1);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 34;BA.debugLine="LoadProps(Props) 'load propertys";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_loadprops" /*RemoteObject*/ ,(Object)(_props));
 BA.debugLineNum = 35;BA.debugLine="If Aligment.Trim = \"CENTER\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_aligment" /*RemoteObject*/ ).runMethod(true,"trim"),BA.ObjectToString("CENTER"))) { 
 BA.debugLineNum = 36;BA.debugLine="CenterAllContent(Lbl)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_centerallcontent" /*RemoteObject*/ ,(Object)(_lbl));
 }else {
 BA.debugLineNum = 38;BA.debugLine="LeftAllContent(Lbl)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_leftallcontent" /*RemoteObject*/ ,(Object)(_lbl));
 };
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "xuiimagebutton","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(67108864);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 28;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(134217728);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _leftallcontent(RemoteObject __ref,RemoteObject _lbl) throws Exception{
try {
		Debug.PushSubsStack("LeftAllContent (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("leftallcontent")) { return __ref.runUserSub(false, "xuiimagebutton","leftallcontent", __ref, _lbl);}
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 87;BA.debugLine="Private Sub LeftAllContent(lbl As Label)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 89;BA.debugLine="cmdButton = objXUI.CreatePanel(\"cmdButton\")";
Debug.ShouldStop(16777216);
__ref.setField ("_cmdbutton" /*RemoteObject*/ ,__ref.getField(false,"_objxui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("cmdButton"))));
 BA.debugLineNum = 90;BA.debugLine="cmdButton.Height = mBase.Height";
Debug.ShouldStop(33554432);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 91;BA.debugLine="cmdButton.Width = mBase.Width";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 94;BA.debugLine="imgIcon = CreateImageView(\"imgIcon\")";
Debug.ShouldStop(536870912);
__ref.setField ("_imgicon" /*RemoteObject*/ ,__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_createimageview" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("imgIcon"))));
 BA.debugLineNum = 95;BA.debugLine="If ImageFileName <> \"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_imagefilename" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 96;BA.debugLine="imgIcon.Height = cmdButton.Height-Margin*2";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1));
 BA.debugLineNum = 97;BA.debugLine="imgIcon.Width = cmdButton.Height-Margin*2";
Debug.ShouldStop(1);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1));
 BA.debugLineNum = 98;BA.debugLine="Dim image As Bitmap = LoadBitmap(File.DirAssets,";
Debug.ShouldStop(2);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_image = xuiimagebutton.__c.runMethod(false,"LoadBitmap",(Object)(xuiimagebutton.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(__ref.getField(true,"_imagefilename" /*RemoteObject*/ )));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 99;BA.debugLine="imgIcon.SetBitmap(image.Resize(imgIcon.Width, im";
Debug.ShouldStop(4);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_image.runMethod(false,"Resize",(Object)(BA.numberCast(float.class, __ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getHeight"))),(Object)(xuiimagebutton.__c.getField(true,"True"))).getObject())));
 }else {
 BA.debugLineNum = 101;BA.debugLine="imgIcon.Height = 0";
Debug.ShouldStop(16);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 102;BA.debugLine="imgIcon.Width = 0";
Debug.ShouldStop(32);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 106;BA.debugLine="lblButton = CreateLabel(\"lblButton\", lbl)";
Debug.ShouldStop(512);
__ref.setField ("_lblbutton" /*RemoteObject*/ ,__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("lblButton")),(Object)(_lbl)));
 BA.debugLineNum = 107;BA.debugLine="lblButton.Height = cmdButton.Height-Margin*2";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1));
 BA.debugLineNum = 108;BA.debugLine="lblButton.Width = cmdButton.Width-imgIcon.Width-L";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_labelmargin" /*RemoteObject*/ ),__ref.getField(true,"_leftmargin" /*RemoteObject*/ )}, "---",3, 1));
 BA.debugLineNum = 109;BA.debugLine="lblButton.SetTextAlignment(\"CENTER\", TextAligment";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(__ref.getField(true,"_textaligment" /*RemoteObject*/ )));
 BA.debugLineNum = 113;BA.debugLine="cmdButton.AddView(imgIcon,LeftMargin,Margin, imgI";
Debug.ShouldStop(65536);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imgicon" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_leftmargin" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_margin" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 114;BA.debugLine="cmdButton.AddView(lblButton,imgIcon.Left+imgIcon.";
Debug.ShouldStop(131072);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_labelmargin" /*RemoteObject*/ )}, "++",2, 1)),(Object)(__ref.getField(true,"_margin" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 117;BA.debugLine="mBase.AddView(cmdButton,0dip,0dip,mBase.Width,mBa";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).getObject())),(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 118;BA.debugLine="mBase.Color = objXUI.PaintOrColorToColor(BaseColo";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_objxui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(__ref.getField(false,"_basecolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadprops(RemoteObject __ref,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("LoadProps (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("loadprops")) { return __ref.runUserSub(false, "xuiimagebutton","loadprops", __ref, _props);}
Debug.locals.put("Props", _props);
 BA.debugLineNum = 143;BA.debugLine="Public Sub LoadProps(Props As Map)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="Margin = Props.Get(\"Margin\")";
Debug.ShouldStop(32768);
__ref.setField ("_margin" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Margin"))))));
 BA.debugLineNum = 145;BA.debugLine="LabelMargin = Props.Get(\"LabelMargin\")";
Debug.ShouldStop(65536);
__ref.setField ("_labelmargin" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("LabelMargin"))))));
 BA.debugLineNum = 146;BA.debugLine="TextAligment = Props.Get(\"TextAligment\")";
Debug.ShouldStop(131072);
__ref.setField ("_textaligment" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextAligment"))))));
 BA.debugLineNum = 147;BA.debugLine="Aligment = Props.Get(\"Aligment\")";
Debug.ShouldStop(262144);
__ref.setField ("_aligment" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Aligment"))))));
 BA.debugLineNum = 148;BA.debugLine="ImageFileName = Props.Get(\"ImageFileName\")";
Debug.ShouldStop(524288);
__ref.setField ("_imagefilename" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ImageFileName"))))));
 BA.debugLineNum = 149;BA.debugLine="LeftMargin = Props.Get(\"LeftMargin\")";
Debug.ShouldStop(1048576);
__ref.setField ("_leftmargin" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("LeftMargin"))))));
 BA.debugLineNum = 150;BA.debugLine="PressedColor = Props.Get(\"PressedColor\")";
Debug.ShouldStop(2097152);
__ref.setField ("_pressedcolor" /*RemoteObject*/ ,_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PressedColor")))));
 BA.debugLineNum = 151;BA.debugLine="BaseColor = Props.Get(\"BaseColor\")";
Debug.ShouldStop(4194304);
__ref.setField ("_basecolor" /*RemoteObject*/ ,_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BaseColor")))));
 BA.debugLineNum = 152;BA.debugLine="PressDelay = Props.Get(\"PressDelay\")";
Debug.ShouldStop(8388608);
__ref.setField ("_pressdelay" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PressDelay"))))));
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _measuretextwidth(RemoteObject __ref,RemoteObject _text,RemoteObject _font1) throws Exception{
try {
		Debug.PushSubsStack("MeasureTextWidth (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("measuretextwidth")) { return __ref.runUserSub(false, "xuiimagebutton","measuretextwidth", __ref, _text, _font1);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
Debug.locals.put("Text", _text);
Debug.locals.put("Font1", _font1);
 BA.debugLineNum = 122;BA.debugLine="Private Sub MeasureTextWidth(Text As String, Font1";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="Private bmp As Bitmap";
Debug.ShouldStop(134217728);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 125;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
Debug.ShouldStop(268435456);
_bmp.runVoidMethod ("InitializeMutable",(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 126;BA.debugLine="Private cvs As Canvas";
Debug.ShouldStop(536870912);
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 127;BA.debugLine="cvs.Initialize2(bmp)";
Debug.ShouldStop(1073741824);
_cvs.runVoidMethod ("Initialize2",(Object)((_bmp.getObject())));
 BA.debugLineNum = 128;BA.debugLine="Return cvs.MeasureStringWidth(Text, Font1.ToNativ";
Debug.ShouldStop(-2147483648);
if (true) return BA.numberCast(int.class, _cvs.runMethod(true,"MeasureStringWidth",(Object)(_text),(Object)((_font1.runMethod(false,"ToNativeFont").getObject())),(Object)(_font1.runMethod(true,"getSize"))));
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}