﻿

#pragma checksum "C:\workspace\Speech\SpeechCustomUi\MainPage.xaml" "{406ea660-64cf-4c82-b6f0-42d48172a799}" "23A21B1D15D0714233856BF70AF8C72D"
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace SpeechCustomUi
{
    partial class MainPage : global::Windows.UI.Xaml.Controls.Page, global::Windows.UI.Xaml.Markup.IComponentConnector
    {
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
 
        public void Connect(int connectionId, object target)
        {
            switch(connectionId)
            {
            case 1:
                #line 15 "..\..\..\MainPage.xaml"
                ((global::Windows.UI.Xaml.UIElement)(target)).Tapped += this.Page_Tapped;
                 #line default
                 #line hidden
                #line 15 "..\..\..\MainPage.xaml"
                ((global::Windows.UI.Xaml.UIElement)(target)).KeyDown += this.Page_KeyDown;
                 #line default
                 #line hidden
                #line 15 "..\..\..\MainPage.xaml"
                ((global::Windows.UI.Xaml.UIElement)(target)).RightTapped += this.Page_RightTapped;
                 #line default
                 #line hidden
                break;
            case 2:
                #line 109 "..\..\..\MainPage.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ToggleButton)(target)).Checked += this.Command_Checked;
                 #line default
                 #line hidden
                break;
            case 3:
                #line 112 "..\..\..\MainPage.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ToggleButton)(target)).Checked += this.Chat_Checked;
                 #line default
                 #line hidden
                break;
            case 4:
                #line 117 "..\..\..\MainPage.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.bing_Click;
                 #line default
                 #line hidden
                break;
            case 5:
                #line 123 "..\..\..\MainPage.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.sobot_Click;
                 #line default
                 #line hidden
                break;
            case 6:
                #line 129 "..\..\..\MainPage.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.turing_Click;
                 #line default
                 #line hidden
                break;
            case 7:
                #line 70 "..\..\..\MainPage.xaml"
                ((global::Windows.UI.Xaml.Controls.TextBox)(target)).TextChanged += this.UserContent_TextChanged;
                 #line default
                 #line hidden
                break;
            case 8:
                #line 71 "..\..\..\MainPage.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.SpeakButton_Click;
                 #line default
                 #line hidden
                break;
            case 9:
                #line 76 "..\..\..\MainPage.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.CancelButton_Click;
                 #line default
                 #line hidden
                break;
            case 10:
                #line 77 "..\..\..\MainPage.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.CortanaButton_Click;
                 #line default
                 #line hidden
                break;
            case 11:
                #line 50 "..\..\..\MainPage.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.Button_Click_1;
                 #line default
                 #line hidden
                break;
            case 12:
                #line 52 "..\..\..\MainPage.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.SpeakButton_Click;
                 #line default
                 #line hidden
                break;
            }
            this._contentLoaded = true;
        }
    }
}


