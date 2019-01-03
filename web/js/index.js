function select_page() {
    document.getElementById("iframe_body").setAttribute("src", "select_page.jsp");
}

function insert_page() {
    document.getElementById("iframe_body").setAttribute("src", "insert_page.jsp")
}

function edit(username) {
    var str = ["username","password", "name", "phone_number", "mail"];
    for (var i = 0; i < 5; i++) {
        str[i] += username;
        document.getElementById(str[i]).removeAttribute("disabled");
    }
    document.getElementById("commit"+username).setAttribute("type","submit");
    document.getElementById("cancel"+username).setAttribute("type", "button");
}

function cancel(username) {
    var str = ["password", "name", "phone_number", "mail"];
    var btn = ["commit", "cancel"];
    for (var i = 0; i < 4; i++) {
        str[i]+=username;
        document.getElementById(str[i]).setAttribute("disabled", false);
    }
    for (var i = 0; i < 2; i++) {
        btn[i] += username;
        document.getElementById(btn[i]).setAttribute("type", "hidden");
    }
}