$(document).ready(function() {
    cargarUsuarios();
});

async function cargarUsuarios() {
    try {
        const response = await fetch('usuario'); // Hacer la solicitud al endpoint '/usuario'
        if (!response.ok) {
            throw new Error('Network response was not ok.');
        }

        const usuarios = await response.json();
        let listadoHTML = '';

        for (let usuario of usuarios) {
            let usuarioHTML =
                `<tr><td>${usuario.id}</td><td>${usuario.nombre} ${usuario.apellido}</td><td>${usuario.email}</td><td>${usuario.telefono}</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>`;

            listadoHTML += usuarioHTML;
        }

        document.querySelector('#usuarios tbody').innerHTML = listadoHTML;
    } catch (error) {
        console.error('Error:', error);
    }
}
