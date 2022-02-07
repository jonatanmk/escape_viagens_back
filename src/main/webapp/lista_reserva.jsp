<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Reservas</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Navbar</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="reserva.html">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="CreateAndFindReserva">Lista de
							Reservas</a></li>
				</ul>
				<form action="CreateAndFindReserva" method="GET" class="d-flex">
					<input name="pesquisa" class="form-control me-2" type="search"
						placeholder="Pesquisar..." aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Buscar</button>
				</form>
			</div>
		</div>
	</nav>

	<br>

	<div class="container">
		<div class="row">
			<div class="cold-md-7">
				<hr>
				<h3>Reservas Cadastrados</h3>
				<hr>
				<table class="table">
				<thead>
					<tr>
						<th>#</th>
						<th>Nome</th>
						<th>CPF</th>
						<th>Id Destino</th>
						<th>Destino</th>
						<th>Dias de reserva</th>
						<th>Data da reserva</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${reservas}" var="reserva">
							<tr>
								
								<td>${reserva.id}</td>
								<td>${reserva.nome}</td>
								<td>${reserva.cpf}</td>
								<td>${reserva.idDestino}</td>
								<td>${reserva.destino}</td>
								<td>${reserva.diasReserva}</td>
								<td>${reserva.dataReserva}</td>
								<td>
									<a href="ReservaDestroy?reservaId=${reserva.id}">deletar</a> |
									<a href="ReservaUpdate?reservaId=${reserva.id}">atualizar</a>
								</td>
							</tr>
						</c:forEach>
				</tbody>
			</table>
			<br>
			<h5><a href="reserva.html">Voltar para o Cadastro de Reservas</a></h5>
				
			</div>
		</div>
	</div>

	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous">
	</script>
</body>
</html>