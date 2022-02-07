<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atualizar Reserva</title>
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
				<h3>Atualizar Reserva</h3>
				<hr>
				<form action="ReservaUpdate" method="POST">
					<input value="${reserva.id}" name="id" type="number"
						style="visibility: hidden">
					<div class="form-floating mb-3">
						<input value="${reserva.nome}" name="nome" maxlength="40" type="text" class="form-control"
							id="floatingInput1"> <label>Nome Completo</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${reserva.cpf}" name="cpf" maxlength="11" type="text" class="form-control">
						<label>CPF (apenas números)</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${reserva.idDestino}" name="idDestino" maxlength="3" type="text" class="form-control">
						<label>Id Destino</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${reserva.destino}" name="destino" maxlength="40" type="text" class="form-control">
						<label>Destino</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${reserva.diasReserva}" name="diasReserva" maxlength="3" type="text" class="form-control">
						<label>Dias de Reserva</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${reserva.dataReserva}" name="dataReserva" type="date" class="form-control"
							placeholder="Data da Reserva"> <label>Data da Reserva</label>
					</div>

					<button class="btn btn-success" type="submit">Atualizar
						Dados</button>
					<button class="btn btn-secondary" type="reset">Limpar
						Formulário</button>

				</form>
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