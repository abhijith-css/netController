function login(){

       var username=$("#username").val();
       var password= $("#password").val();
       formData={"username":username,"password":password};
    console.log(formData);
    $.ajax({
        type: "GET",
        contentType: "application/json",
        url: "/login",
        data: JSON.stringify(formData),
        dataType: 'json',
        success: function(result) {
            if (result.status == "Success") {
                $("#postResultDiv")
                    .html(
                        "<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" +
                        "Post Successfully! <br>" +
                        "---> Congrats !!" +
                        "</p>");
            } else {
                $("#postResultDiv").html(
                    "<strong>Error</strong>");
            }
            console.log(result);
        },
        error: function(e) {
            alert("Error!")
            console.log("ERROR: ", e);
        }
    });

}

