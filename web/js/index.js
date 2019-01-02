function select_page() {
    document.getElementById("iframe_body").setAttribute("src","select_page.jsp");
    document.selectForm.submit();
}

function insert_page() {
    document.getElementById("iframe_body").setAttribute("src","insert_page.jsp")
}