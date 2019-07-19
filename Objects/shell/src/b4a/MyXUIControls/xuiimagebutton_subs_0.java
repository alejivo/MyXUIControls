package b4a.MyXUIControls;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xuiimagebutton_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,249);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "xuiimagebutton","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 249;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bottomandcenter(RemoteObject __ref,RemoteObject _lbl) throws Exception{
try {
		Debug.PushSubsStack("BottomAndCenter (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("bottomandcenter")) { return __ref.runUserSub(false, "xuiimagebutton","bottomandcenter", __ref, _lbl);}
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _labelstartpoint = RemoteObject.createImmutable(0);
RemoteObject _imagestartpoint = RemoteObject.createImmutable(0);
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 47;BA.debugLine="Private Sub BottomAndCenter(lbl As Label)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="cmdButton = objXUI.CreatePanel(\"cmdButton\")";
Debug.ShouldStop(65536);
__ref.setField ("_cmdbutton" /*RemoteObject*/ ,__ref.getField(false,"_objxui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("cmdButton"))));
 BA.debugLineNum = 50;BA.debugLine="cmdButton.Height = mBase.Height";
Debug.ShouldStop(131072);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 51;BA.debugLine="cmdButton.Width = mBase.Width";
Debug.ShouldStop(262144);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 54;BA.debugLine="lblButton = CreateLabel(\"lblButton\", lbl)";
Debug.ShouldStop(2097152);
__ref.setField ("_lblbutton" /*RemoteObject*/ ,__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("lblButton")),(Object)(_lbl)));
 BA.debugLineNum = 55;BA.debugLine="lblButton.Width = cmdButton.Width-Margin*2";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1));
 BA.debugLineNum = 56;BA.debugLine="lblButton.Height = mBase.Height";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 57;BA.debugLine="lblButton.Height = MeasureTextHeight(lblButton.Te";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_measuretextheight" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(false,"getFont"))));
 BA.debugLineNum = 58;BA.debugLine="lblButton.SetTextAlignment(\"CENTER\", TextAligment";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(__ref.getField(true,"_textaligment" /*RemoteObject*/ )));
 BA.debugLineNum = 62;BA.debugLine="imgIcon = CreateImageView(\"imgIcon\")";
Debug.ShouldStop(536870912);
__ref.setField ("_imgicon" /*RemoteObject*/ ,__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_createimageview" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("imgIcon"))));
 BA.debugLineNum = 63;BA.debugLine="If ImageFileName <> \"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_imagefilename" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 64;BA.debugLine="imgIcon.Height = cmdButton.Height-Margin*2-lblBu";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2),__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_labelmargin" /*RemoteObject*/ )}, "-*--",3, 1));
 BA.debugLineNum = 65;BA.debugLine="imgIcon.Width = cmdButton.Height-Margin*2-lblBut";
Debug.ShouldStop(1);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2),__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_labelmargin" /*RemoteObject*/ )}, "-*--",3, 1));
 BA.debugLineNum = 66;BA.debugLine="Dim image As Bitmap = LoadBitmap(File.DirAssets,";
Debug.ShouldStop(2);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_image = xuiimagebutton.__c.runMethod(false,"LoadBitmap",(Object)(xuiimagebutton.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(__ref.getField(true,"_imagefilename" /*RemoteObject*/ )));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 67;BA.debugLine="imgIcon.SetBitmap(image.Resize(imgIcon.Width, im";
Debug.ShouldStop(4);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_image.runMethod(false,"Resize",(Object)(BA.numberCast(float.class, __ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getHeight"))),(Object)(xuiimagebutton.__c.getField(true,"True"))).getObject())));
 }else {
 BA.debugLineNum = 69;BA.debugLine="imgIcon.Height = 0";
Debug.ShouldStop(16);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 70;BA.debugLine="imgIcon.Width = 0";
Debug.ShouldStop(32);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 75;BA.debugLine="Dim LabelStartPoint As Int = (cmdButton.Width-lbl";
Debug.ShouldStop(1024);
_labelstartpoint = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("LabelStartPoint", _labelstartpoint);Debug.locals.put("LabelStartPoint", _labelstartpoint);
 BA.debugLineNum = 76;BA.debugLine="Dim ImageStartPoint As Int = (cmdButton.Width-img";
Debug.ShouldStop(2048);
_imagestartpoint = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("ImageStartPoint", _imagestartpoint);Debug.locals.put("ImageStartPoint", _imagestartpoint);
 BA.debugLineNum = 80;BA.debugLine="cmdButton.AddView(imgIcon, ImageStartPoint,Margin";
Debug.ShouldStop(32768);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imgicon" /*RemoteObject*/ ).getObject())),(Object)(_imagestartpoint),(Object)(__ref.getField(true,"_margin" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 81;BA.debugLine="cmdButton.AddView(lblButton,LabelStartPoint, imgI";
Debug.ShouldStop(65536);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).getObject())),(Object)(_labelstartpoint),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_labelmargin" /*RemoteObject*/ )}, "+",1, 1)),(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "*",0, 1)));
 BA.debugLineNum = 84;BA.debugLine="mBase.AddView(cmdButton,0dip,0dip,mBase.Width,mBa";
Debug.ShouldStop(524288);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).getObject())),(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 85;BA.debugLine="mBase.Color = objXUI.PaintOrColorToColor(BaseColo";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_objxui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(__ref.getField(false,"_basecolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("CenterAllContent (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("centerallcontent")) { return __ref.runUserSub(false, "xuiimagebutton","centerallcontent", __ref, _lbl);}
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _contentsize = RemoteObject.createImmutable(0);
RemoteObject _startpoint = RemoteObject.createImmutable(0);
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 91;BA.debugLine="Private Sub CenterAllContent(lbl As Label)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 93;BA.debugLine="cmdButton = objXUI.CreatePanel(\"cmdButton\")";
Debug.ShouldStop(268435456);
__ref.setField ("_cmdbutton" /*RemoteObject*/ ,__ref.getField(false,"_objxui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("cmdButton"))));
 BA.debugLineNum = 94;BA.debugLine="cmdButton.Height = mBase.Height";
Debug.ShouldStop(536870912);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 95;BA.debugLine="cmdButton.Width = mBase.Width";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 98;BA.debugLine="imgIcon = CreateImageView(\"imgIcon\")";
Debug.ShouldStop(2);
__ref.setField ("_imgicon" /*RemoteObject*/ ,__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_createimageview" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("imgIcon"))));
 BA.debugLineNum = 99;BA.debugLine="If ImageFileName <> \"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_imagefilename" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 100;BA.debugLine="imgIcon.Height = cmdButton.Height-Margin*2";
Debug.ShouldStop(8);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1));
 BA.debugLineNum = 101;BA.debugLine="imgIcon.Width = cmdButton.Height-Margin*2";
Debug.ShouldStop(16);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1));
 BA.debugLineNum = 102;BA.debugLine="Dim image As Bitmap = LoadBitmap(File.DirAssets,";
Debug.ShouldStop(32);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_image = xuiimagebutton.__c.runMethod(false,"LoadBitmap",(Object)(xuiimagebutton.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(__ref.getField(true,"_imagefilename" /*RemoteObject*/ )));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 103;BA.debugLine="imgIcon.SetBitmap(image.Resize(imgIcon.Width, im";
Debug.ShouldStop(64);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_image.runMethod(false,"Resize",(Object)(BA.numberCast(float.class, __ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getHeight"))),(Object)(xuiimagebutton.__c.getField(true,"True"))).getObject())));
 }else {
 BA.debugLineNum = 105;BA.debugLine="imgIcon.Height = 0";
Debug.ShouldStop(256);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 106;BA.debugLine="imgIcon.Width = 0";
Debug.ShouldStop(512);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 110;BA.debugLine="lblButton = CreateLabel(\"lblButton\", lbl)";
Debug.ShouldStop(8192);
__ref.setField ("_lblbutton" /*RemoteObject*/ ,__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("lblButton")),(Object)(_lbl)));
 BA.debugLineNum = 111;BA.debugLine="lblButton.Height = cmdButton.Height-Margin*2";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1));
 BA.debugLineNum = 112;BA.debugLine="lblButton.Width = cmdButton.Width-imgIcon.Width-L";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_labelmargin" /*RemoteObject*/ ),__ref.getField(true,"_leftmargin" /*RemoteObject*/ )}, "---",3, 1));
 BA.debugLineNum = 113;BA.debugLine="lblButton.Width = MeasureTextWidth(lblButton.Text";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_measuretextwidth" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(false,"getFont"))));
 BA.debugLineNum = 114;BA.debugLine="lblButton.SetTextAlignment(\"CENTER\", TextAligment";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(__ref.getField(true,"_textaligment" /*RemoteObject*/ )));
 BA.debugLineNum = 118;BA.debugLine="Dim ContentSize As Int = imgIcon.Width+Margin+lbl";
Debug.ShouldStop(2097152);
_contentsize = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_margin" /*RemoteObject*/ ),__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "++",2, 1);Debug.locals.put("ContentSize", _contentsize);Debug.locals.put("ContentSize", _contentsize);
 BA.debugLineNum = 119;BA.debugLine="Dim StartPoint As Int = (cmdButton.Width-ContentS";
Debug.ShouldStop(4194304);
_startpoint = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getWidth"),_contentsize}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("StartPoint", _startpoint);Debug.locals.put("StartPoint", _startpoint);
 BA.debugLineNum = 123;BA.debugLine="cmdButton.AddView(imgIcon,StartPoint,Margin, imgI";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imgicon" /*RemoteObject*/ ).getObject())),(Object)(_startpoint),(Object)(__ref.getField(true,"_margin" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 124;BA.debugLine="cmdButton.AddView(lblButton,imgIcon.Left+imgIcon.";
Debug.ShouldStop(134217728);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_labelmargin" /*RemoteObject*/ )}, "++",2, 1)),(Object)(__ref.getField(true,"_margin" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 127;BA.debugLine="mBase.AddView(cmdButton,0dip,0dip,mBase.Width,mBa";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).getObject())),(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 128;BA.debugLine="mBase.Color = objXUI.PaintOrColorToColor(BaseColo";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_objxui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(__ref.getField(false,"_basecolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("cmdButton_Click (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,241);
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
		Debug.PushSubsStack("cmdButton_Click (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,241);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 242;BA.debugLine="mBase.Color = objXUI.PaintOrColorToColor(PressedC";
Debug.ShouldStop(131072);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_objxui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(__ref.getField(false,"_pressedcolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 243;BA.debugLine="Sleep(PressDelay)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "xuiimagebutton", "cmdbutton_click"),__ref.getField(true,"_pressdelay" /*RemoteObject*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 244;BA.debugLine="mBase.Color = objXUI.PaintOrColorToColor(BaseColo";
Debug.ShouldStop(524288);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_objxui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(__ref.getField(false,"_basecolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 245;BA.debugLine="If SubExists(mCallBack,mEventName&\"_Click\") Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("CreateImageView (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,235);
if (RapidSub.canDelegate("createimageview")) { return __ref.runUserSub(false, "xuiimagebutton","createimageview", __ref, _eventname);}
RemoteObject _tmp_imgv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 235;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
Debug.ShouldStop(1024);
 BA.debugLineNum = 236;BA.debugLine="Dim tmp_imgv As ImageView";
Debug.ShouldStop(2048);
_tmp_imgv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("tmp_imgv", _tmp_imgv);
 BA.debugLineNum = 237;BA.debugLine="tmp_imgv.Initialize(EventName)";
Debug.ShouldStop(4096);
_tmp_imgv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 238;BA.debugLine="Return tmp_imgv";
Debug.ShouldStop(8192);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _tmp_imgv.getObject());
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("CreateLabel (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,222);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "xuiimagebutton","createlabel", __ref, _eventname, _lbl);}
RemoteObject _tmp_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("EventName", _eventname);
Debug.locals.put("Lbl", _lbl);
 BA.debugLineNum = 222;BA.debugLine="Private Sub CreateLabel(EventName As String, Lbl A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 223;BA.debugLine="Dim tmp_lbl As Label";
Debug.ShouldStop(1073741824);
_tmp_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("tmp_lbl", _tmp_lbl);
 BA.debugLineNum = 224;BA.debugLine="tmp_lbl.Initialize(EventName)";
Debug.ShouldStop(-2147483648);
_tmp_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 226;BA.debugLine="tmp_lbl.SingleLine = True";
Debug.ShouldStop(2);
_tmp_lbl.runVoidMethod ("setSingleLine",xuiimagebutton.__c.getField(true,"True"));
 BA.debugLineNum = 227;BA.debugLine="tmp_lbl.TextSize = Lbl.TextSize";
Debug.ShouldStop(4);
_tmp_lbl.runMethod(true,"setTextSize",_lbl.runMethod(true,"getTextSize"));
 BA.debugLineNum = 228;BA.debugLine="tmp_lbl.Typeface = Lbl.Typeface";
Debug.ShouldStop(8);
_tmp_lbl.runMethod(false,"setTypeface",_lbl.runMethod(false,"getTypeface"));
 BA.debugLineNum = 229;BA.debugLine="tmp_lbl.Text = Lbl.Text";
Debug.ShouldStop(16);
_tmp_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_lbl.runMethod(true,"getText")));
 BA.debugLineNum = 230;BA.debugLine="tmp_lbl.TextColor = Lbl.TextColor";
Debug.ShouldStop(32);
_tmp_lbl.runMethod(true,"setTextColor",_lbl.runMethod(true,"getTextColor"));
 BA.debugLineNum = 232;BA.debugLine="Return tmp_lbl";
Debug.ShouldStop(128);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _tmp_lbl.getObject());
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 35;BA.debugLine="Select Aligment.Trim";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(__ref.getField(true,"_aligment" /*RemoteObject*/ ).runMethod(true,"trim"),BA.ObjectToString("CENTER"),BA.ObjectToString("BOTTOM"))) {
case 0: {
 BA.debugLineNum = 37;BA.debugLine="CenterAllContent(Lbl)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_centerallcontent" /*RemoteObject*/ ,(Object)(_lbl));
 break; }
case 1: {
 BA.debugLineNum = 39;BA.debugLine="BottomAndCenter(Lbl)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_bottomandcenter" /*RemoteObject*/ ,(Object)(_lbl));
 break; }
default: {
 BA.debugLineNum = 41;BA.debugLine="LeftAllContent(Lbl)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_leftallcontent" /*RemoteObject*/ ,(Object)(_lbl));
 break; }
}
;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("LeftAllContent (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("leftallcontent")) { return __ref.runUserSub(false, "xuiimagebutton","leftallcontent", __ref, _lbl);}
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 133;BA.debugLine="Private Sub LeftAllContent(lbl As Label)";
Debug.ShouldStop(16);
 BA.debugLineNum = 135;BA.debugLine="cmdButton = objXUI.CreatePanel(\"cmdButton\")";
Debug.ShouldStop(64);
__ref.setField ("_cmdbutton" /*RemoteObject*/ ,__ref.getField(false,"_objxui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("cmdButton"))));
 BA.debugLineNum = 136;BA.debugLine="cmdButton.Height = mBase.Height";
Debug.ShouldStop(128);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 137;BA.debugLine="cmdButton.Width = mBase.Width";
Debug.ShouldStop(256);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 140;BA.debugLine="imgIcon = CreateImageView(\"imgIcon\")";
Debug.ShouldStop(2048);
__ref.setField ("_imgicon" /*RemoteObject*/ ,__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_createimageview" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("imgIcon"))));
 BA.debugLineNum = 141;BA.debugLine="If ImageFileName <> \"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_imagefilename" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 142;BA.debugLine="imgIcon.Height = cmdButton.Height-Margin*2";
Debug.ShouldStop(8192);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1));
 BA.debugLineNum = 143;BA.debugLine="imgIcon.Width = cmdButton.Height-Margin*2";
Debug.ShouldStop(16384);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1));
 BA.debugLineNum = 144;BA.debugLine="Dim image As Bitmap = LoadBitmap(File.DirAssets,";
Debug.ShouldStop(32768);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_image = xuiimagebutton.__c.runMethod(false,"LoadBitmap",(Object)(xuiimagebutton.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(__ref.getField(true,"_imagefilename" /*RemoteObject*/ )));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 145;BA.debugLine="imgIcon.SetBitmap(image.Resize(imgIcon.Width, im";
Debug.ShouldStop(65536);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_image.runMethod(false,"Resize",(Object)(BA.numberCast(float.class, __ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getHeight"))),(Object)(xuiimagebutton.__c.getField(true,"True"))).getObject())));
 }else {
 BA.debugLineNum = 147;BA.debugLine="imgIcon.Height = 0";
Debug.ShouldStop(262144);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 148;BA.debugLine="imgIcon.Width = 0";
Debug.ShouldStop(524288);
__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 152;BA.debugLine="lblButton = CreateLabel(\"lblButton\", lbl)";
Debug.ShouldStop(8388608);
__ref.setField ("_lblbutton" /*RemoteObject*/ ,__ref.runClassMethod (b4a.MyXUIControls.xuiimagebutton.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("lblButton")),(Object)(_lbl)));
 BA.debugLineNum = 153;BA.debugLine="lblButton.Height = cmdButton.Height-Margin*2";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_margin" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1));
 BA.debugLineNum = 154;BA.debugLine="lblButton.Width = cmdButton.Width-imgIcon.Width-L";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_labelmargin" /*RemoteObject*/ ),__ref.getField(true,"_leftmargin" /*RemoteObject*/ )}, "---",3, 1));
 BA.debugLineNum = 155;BA.debugLine="lblButton.SetTextAlignment(\"CENTER\", TextAligment";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(__ref.getField(true,"_textaligment" /*RemoteObject*/ )));
 BA.debugLineNum = 159;BA.debugLine="cmdButton.AddView(imgIcon,LeftMargin,Margin, imgI";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imgicon" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_leftmargin" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_margin" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 160;BA.debugLine="cmdButton.AddView(lblButton,imgIcon.Left+imgIcon.";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_imgicon" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_labelmargin" /*RemoteObject*/ )}, "++",2, 1)),(Object)(__ref.getField(true,"_margin" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_lblbutton" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 163;BA.debugLine="mBase.AddView(cmdButton,0dip,0dip,mBase.Width,mBa";
Debug.ShouldStop(4);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_cmdbutton" /*RemoteObject*/ ).getObject())),(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 164;BA.debugLine="mBase.Color = objXUI.PaintOrColorToColor(BaseColo";
Debug.ShouldStop(8);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_objxui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(__ref.getField(false,"_basecolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("LoadProps (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("loadprops")) { return __ref.runUserSub(false, "xuiimagebutton","loadprops", __ref, _props);}
Debug.locals.put("Props", _props);
 BA.debugLineNum = 210;BA.debugLine="Public Sub LoadProps(Props As Map)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Margin = Props.Get(\"Margin\")";
Debug.ShouldStop(262144);
__ref.setField ("_margin" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Margin"))))));
 BA.debugLineNum = 212;BA.debugLine="LabelMargin = Props.Get(\"LabelMargin\")";
Debug.ShouldStop(524288);
__ref.setField ("_labelmargin" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("LabelMargin"))))));
 BA.debugLineNum = 213;BA.debugLine="TextAligment = Props.Get(\"TextAligment\")";
Debug.ShouldStop(1048576);
__ref.setField ("_textaligment" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextAligment"))))));
 BA.debugLineNum = 214;BA.debugLine="Aligment = Props.Get(\"Aligment\")";
Debug.ShouldStop(2097152);
__ref.setField ("_aligment" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Aligment"))))));
 BA.debugLineNum = 215;BA.debugLine="ImageFileName = Props.Get(\"ImageFileName\")";
Debug.ShouldStop(4194304);
__ref.setField ("_imagefilename" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ImageFileName"))))));
 BA.debugLineNum = 216;BA.debugLine="LeftMargin = Props.Get(\"LeftMargin\")";
Debug.ShouldStop(8388608);
__ref.setField ("_leftmargin" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("LeftMargin"))))));
 BA.debugLineNum = 217;BA.debugLine="PressedColor = Props.Get(\"PressedColor\")";
Debug.ShouldStop(16777216);
__ref.setField ("_pressedcolor" /*RemoteObject*/ ,_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PressedColor")))));
 BA.debugLineNum = 218;BA.debugLine="BaseColor = Props.Get(\"BaseColor\")";
Debug.ShouldStop(33554432);
__ref.setField ("_basecolor" /*RemoteObject*/ ,_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BaseColor")))));
 BA.debugLineNum = 219;BA.debugLine="PressDelay = Props.Get(\"PressDelay\")";
Debug.ShouldStop(67108864);
__ref.setField ("_pressdelay" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PressDelay"))))));
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _measuretextheight(RemoteObject __ref,RemoteObject _text,RemoteObject _font1) throws Exception{
try {
		Debug.PushSubsStack("MeasureTextHeight (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("measuretextheight")) { return __ref.runUserSub(false, "xuiimagebutton","measuretextheight", __ref, _text, _font1);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
Debug.locals.put("Text", _text);
Debug.locals.put("Font1", _font1);
 BA.debugLineNum = 188;BA.debugLine="Private Sub MeasureTextHeight(Text As String, Font";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 190;BA.debugLine="Private bmp As Bitmap";
Debug.ShouldStop(536870912);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 191;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
Debug.ShouldStop(1073741824);
_bmp.runVoidMethod ("InitializeMutable",(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 192;BA.debugLine="Private cvs As Canvas";
Debug.ShouldStop(-2147483648);
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 193;BA.debugLine="cvs.Initialize2(bmp)";
Debug.ShouldStop(1);
_cvs.runVoidMethod ("Initialize2",(Object)((_bmp.getObject())));
 BA.debugLineNum = 194;BA.debugLine="Return cvs.MeasureStringHeight(Text, Font1.ToNati";
Debug.ShouldStop(2);
if (true) return BA.numberCast(int.class, _cvs.runMethod(true,"MeasureStringHeight",(Object)(_text),(Object)((_font1.runMethod(false,"ToNativeFont").getObject())),(Object)(_font1.runMethod(true,"getSize"))));
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _measuretextwidth(RemoteObject __ref,RemoteObject _text,RemoteObject _font1) throws Exception{
try {
		Debug.PushSubsStack("MeasureTextWidth (xuiimagebutton) ","xuiimagebutton",2,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("measuretextwidth")) { return __ref.runUserSub(false, "xuiimagebutton","measuretextwidth", __ref, _text, _font1);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
Debug.locals.put("Text", _text);
Debug.locals.put("Font1", _font1);
 BA.debugLineNum = 168;BA.debugLine="Private Sub MeasureTextWidth(Text As String, Font1";
Debug.ShouldStop(128);
 BA.debugLineNum = 170;BA.debugLine="Private bmp As Bitmap";
Debug.ShouldStop(512);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 171;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
Debug.ShouldStop(1024);
_bmp.runVoidMethod ("InitializeMutable",(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(xuiimagebutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 172;BA.debugLine="Private cvs As Canvas";
Debug.ShouldStop(2048);
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 173;BA.debugLine="cvs.Initialize2(bmp)";
Debug.ShouldStop(4096);
_cvs.runVoidMethod ("Initialize2",(Object)((_bmp.getObject())));
 BA.debugLineNum = 174;BA.debugLine="Return cvs.MeasureStringWidth(Text, Font1.ToNativ";
Debug.ShouldStop(8192);
if (true) return BA.numberCast(int.class, _cvs.runMethod(true,"MeasureStringWidth",(Object)(_text),(Object)((_font1.runMethod(false,"ToNativeFont").getObject())),(Object)(_font1.runMethod(true,"getSize"))));
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}