<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Pragma" content="no-cache"> 
    <meta http-equiv="Cache-Control" content="no-cache"> 
    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
    
    <title>Biblioteka | Home</title>
    
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
     <link href="static/css/style.css" rel="stylesheet">
    
    <!--[if lt IE 9]>
		<script src="static/js/html5shiv.min.js"></script>
		<script src="static/js/respond.min.js"></script>
	<![endif]-->
</head>
<body>

	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Biblioteka</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="nowa-ksiazka">Nowa Ksiazka</a></li>
					<li><a href="wszystkie-ksiazki">Wszystkie Ksiazki</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode == 'MODE_HOME'}">
			<div class="container" id="homeDiv">
				<div class="jumbotron text-center">
					<h1>Witaj w bibliotece!</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_KSIAZKI'}">
			<div class="container text-center" id="tasksDiv">
				<h3>Ksiazki</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>
								<th>Id</th>
								<th>ISBN</th>
								<th>Autor</th>
								<th>Tytul</th>
								<th>Wydawnictwo</th>
								<th>Ilosc stron</th>
								<th>Rok wydania</th>
								<th>Status</th>
								<th>Kategoria</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="ksiazka" items="${ksiazki}">
								<tr>
									<td>${ksiazka.id_ksiazki}</td>
									<td>${ksiazka.isbn}</td>
									<td>${ksiazka.autor}</td>
									<td>${ksiazka.tytul}</td>
									<td>${ksiazka.wydawnictwo}</td>
									<td>${ksiazka.ilosc_stron}</td>
									<td>${ksiazka.rok_wydania}</td>
									<td>${ksiazka.status_ksiazki}</td>
									<td>${ksiazka.kategoria}</td>
									<td><a href="updateKsiazki?id=${task.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
									<td><a href="deleteKsiazki?id=${task.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>    
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Zarzadzaj Ksiazkami</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-ksiazka">
					<input type="hidden" name="id" value="${ksiazka.id_ksiazki}"/>
					<div class="form-group">
						<label class="control-label col-md-3">ISBN</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="isbn" value="${ksiazka.isbn}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Autor</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="autor" value="${ksiazka.autor}"/>
						</div>				
					</div>
					<div class="form-group">
                    	<label class="control-label col-md-3">Tytul</label>
                        <div class="col-md-7">
                    	    <input type="text" class="form-control" name="tytul" value="${ksiazka.tytul}"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-md-3">Wydawnictwo</label>
                        <div class="col-md-7">
                            <input type="text" class="form-control" name="wydawnictwo" value="${ksiazka.wydawnictwo}"/>
                        </div>
                    </div>
                     <div class="form-group">
                         <label class="control-label col-md-3">Ilosc stron</label>
                         <div class="col-md-7">
                             <input type="text" class="form-control" name="ilosc_stron" value="${ksiazka.ilosc_stron}"/>
                          </div>
                     </div>

                     <div class="form-group">
                         <label class="control-label col-md-3">Rok wydania</label>
                         <div class="col-md-7">
                              <input type="text" class="form-control" name="rok_wydania" value="${ksiazka.rok_wydania}"/>
                         </div>
                     </div>
                     <div class="form-group">
                          <label class="control-label col-md-3">Kategoria</label>
                          <div class="col-md-7">
                              <input type="text" class="form-control" name="kategoria" value="${ksiazka.kategoria}"/>
                          </div>
                     </div>
                     <div class="form-group">
                          <label class="control-label col-md-3">Status</label>
                          <div class="col-md-7">
                              <input type="text" class="form-control" name="status_ksiazki" value="${ksiazka.status_ksiazki}"/>
                          </div>
                     </div>

					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Dodaj"/>
					</div>
				</form>
			</div>
		</c:when>		
	</c:choose>

	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>