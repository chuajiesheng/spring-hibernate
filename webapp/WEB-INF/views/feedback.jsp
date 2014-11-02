<html xmlns:th="http://www.thymeleaf.org"
      xmlns:form="http://www.springframework.org/tags/form"
      xmlns:c="http://java.sun.com/jsp/jstl/core">
<c:set var="pageTitle" scope="request" value="Mange Items"/>

<head lang="en">
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<form:form name="addItem" action="" method="post" modelAttribute="item">

    <div class="page-action">New Item</div>
    <div>
        <div>
            <form:label for="name" path="name">Name</form:label>
            <div class="controls">
                <form:input path="Name"/>
            </div>
        </div>
        <div>
            <form:label for="message" path="message">Message</form:label>
            <div class="controls">
                <form:input path="message"/>
            </div>
        </div>
        <div>
            <div class="controls">
                <button type="submit" value="Create new item" id="createItem">Create Item</button>
            </div>
        </div>

    </div>
</form:form>
<div>

</div>
<table class="table">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Message</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="f" items="${feedbacks}" varStatus="row">
        <tr>
            <td>
                ${feedbacks[f.key]['id']}
            </td>
            <td>
                ${feedbacks[f.key]['name']}
            </td>
            <td>
                ${feedbacks[f.key]['message']}
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>