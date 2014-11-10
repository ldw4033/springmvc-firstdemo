<%@ page pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<script type="text/javascript" src="${ctx }/static/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="/static/js/jquery.form.js"></script>
<script type="text/javascript">
//prepare the form when the DOM is ready 
$(document).ready(function() { 
	//alert();
    var options = { 
        //target:        '#output1',   // target element(s) to be updated with server response 
        beforeSubmit:  showRequest,  // pre-submit callback 
        success:       showResponse  // post-submit callback 
 
        // other available options: 
        //url:       url         // override for form's 'action' attribute 
        //type:      type        // 'get' or 'post', override for form's 'method' attribute 
        //dataType:  null        // 'xml', 'script', or 'json' (expected server response type) 
        //clearForm: true        // clear all form fields after successful submit 
        //resetForm: true        // reset the form after successful submit 
 
        // $.ajax options can be used here too, for example: 
        //timeout:   3000 
    }; 
 
    // bind form using 'ajaxForm' 
    $('#loginForm').ajaxForm(options); 
}); 
 
// pre-submit callback 
function showRequest(formData, jqForm, options) { 
    // formData is an array; here we use $.param to convert it to a string to display it 
    // but the form plugin does this for you automatically when it submits the data 
    var queryString = $.param(formData); 
 
    // jqForm is a jQuery object encapsulating the form element.  To access the 
    // DOM element for the form do this: 
    // var formElement = jqForm[0]; 
 
   // alert('About to submit: \n\n' + queryString); 
 
    // here we could return false to prevent the form from being submitted; 
    // returning anything other than false will allow the form submit to continue 
    return true; 
} 
 
// post-submit callback 
function showResponse(responseText, statusText, xhr, $form)  { 
    // for normal html responses, the first argument to the success callback 
    // is the XMLHttpRequest object's responseText property 
 
    // if the ajaxForm method was passed an Options Object with the dataType 
    // property set to 'xml' then the first argument to the success callback 
    // is the XMLHttpRequest object's responseXML property 
 
    // if the ajaxForm method was passed an Options Object with the dataType 
    // property set to 'json' then the first argument to the success callback 
    // is the json data object returned by the server 
 
    //alert('status: ' + statusText + '\n\nresponseText: \n' + responseText.password + 
     //   '\n\nThe output div should have already been updated with the responseText.'); 
    
   /*  $('#info').text(responseText.message);
    if(responseText.infoNo==0){
    	return ;
    }else{
    	window.location.href="welcome.do";
    } */
    
} 


</script>
<body>
<h3>Login</h3>

<form action="${BASE}/login" method="post" id="loginForm">
<span id="info"></span>
    <table>
        <tr>
            <td><label for="username">Username:</label></td>
            <td><input type="text" id="username" name="username"/></td>
        </tr>
        <tr>
            <td><label for="password">Password:</label></td>
            <td><input type="password" id="password" name="password"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">Login</button>
            </td>
        </tr>
    </table>
</form>


<c:if test="${not empty login_failure}">
    <p>Login Failure</p>
</c:if>

</body>
</html>