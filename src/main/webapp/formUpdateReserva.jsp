<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atualizar Reserva</title>
<!-- CSS only -->
<link rel="stylesheet" href="./index.css" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="menu">
			<img src="./img/logo.png" />
			<ul>
				<li><a href="index.html">Home</a></li>
				<li><a href="index.html">Destinos</a></li>
				<li><a href="index.html">Promoções</a></li>
				<li><a href="index.html">Contato</a></li>
			</ul>
		</nav>
	</header>

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
						<input value="${reserva.nome}" name="nome" maxlength="40"
							type="text" class="form-control" id="floatingInput1"> <label>Nome
							Completo</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${reserva.cpf}" name="cpf" maxlength="11"
							type="text" class="form-control"> <label>CPF
							(apenas números)</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${reserva.idDestino}" name="idDestino" maxlength="3"
							type="text" class="form-control"> <label>Id
							Destino</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${reserva.destino}" name="destino" maxlength="40"
							type="text" class="form-control"> <label>Destino</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${reserva.diasReserva}" name="diasReserva"
							maxlength="3" type="text" class="form-control"> <label>Dias
							de Reserva</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${reserva.dataReserva}" name="dataReserva"
							type="date" class="form-control" placeholder="Data da Reserva">
						<label>Data da Reserva</label>
					</div>

					<button class="btn btn-success" type="submit">Atualizar
						Dados</button>
					<button class="btn btn-secondary" type="reset">Limpar
						Formulário</button>

				</form>
			</div>
		</div>
	</div>

	<footer class="text-center text-black">
		<div class="fundo p-1 pb-0 mt-5">
			<section>
				<!-- Facebook -->
				<a class="footer1 btn"
					href="https://www.facebook.com/jonatan.vasconcelos"> <img
					src="./img/facebook.png">
				</a>
				<!-- YouTube -->
				<a class="footer1 btn" href="https://youtube.com/user/jonatanmk">
					<img src="./img/youtube.png">
				</a>
				<!-- Instagram -->
				<a class="footer1 btn"
					href="https://www.instagram.com/jonatanvs?r=nametag"> <img
					src="./img/instagram.png">
				</a>
				<!-- Linkedin -->
				<a class="footer1 btn"
					href="https://www.linkedin.com/in/jonatan-vasconcelos-08bb29171">
					<img src="./img/linkedin.png">
				</a>
				<!-- Github -->
				<a class="footer1 btn" href="https://github.com/jonatanmk"
					role="button"> <img src="./img/github.png">
				</a>
			</section>
		</div>
		<div class="fundo text-center p-3">© 2021 Jonatan Vasconcelos
			Soares</div>
	</footer>

	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous">
		
	</script>
</body>
</html>