<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Calc.aspx.cs" Inherits="cv12WebAPP.Calc" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            &nbsp;<asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        </div>
        <div>
            <p>
                <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
            </p>
        </div>
        <div>
            &nbsp;<asp:DropDownList ID="DropDownList1" runat="server" AppendDataBoundItems="True">
                <asp:ListItem Selected="True" Value="plus">+</asp:ListItem>
                <asp:ListItem>-</asp:ListItem>
                <asp:ListItem>*</asp:ListItem>
                <asp:ListItem>/</asp:ListItem>
            </asp:DropDownList>
        </div>
        <div>
            <p>
                <asp:Button ID="compute" runat="server" OnClick="compute_Click" Text="Button" />
            </p>
        </div>
        &nbsp;</form>
</body>
</html>
