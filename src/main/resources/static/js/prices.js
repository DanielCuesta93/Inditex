document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById('priceForm');

    if (form) {
        form.addEventListener('submit', function (event) {
            event.preventDefault(); // Evitar que se recargue la página

            let fechaConsulta = document.getElementById('fechaConsulta').value;
            const productoId = document.getElementById('productoId').value;
            const marcaId = document.getElementById('marcaId').value;

			fechaConsulta = fechaConsulta.replace("T", " ");

			// Verificar si la fecha tiene segundos, si no, agregarlos como ":00"
            if (fechaConsulta.length === 16) {
                fechaConsulta += ":00";  
            }

            // Construir la URL correctamente
            const url = `/prices/api/price?fechaConsulta=${encodeURIComponent(fechaConsulta)}&productoId=${productoId}&marcaId=${marcaId}`;

            // Hacer la solicitud GET
            fetch(url)
                .then(response => {
                    if (!response.ok) {
                        throw new Error('No se encontraron resultados');
                    }
                    return response.json();
                })
                .then(data => {
                    // Mostrar los resultados
                    const resultDiv = document.getElementById('result');
                    resultDiv.innerHTML = `
                        <h2>Resultado de la consulta</h2>
                        <p><strong>ID Producto:</strong> ${data.productId}</p>
                        <p><strong>ID Marca:</strong> ${data.brandId}</p>
                        <p><strong>Tarifa:</strong> ${data.priceList}</p>
                        <p><strong>Fecha de Inicio:</strong> ${data.startDate}</p>
                        <p><strong>Fecha de Fin:</strong> ${data.endDate}</p>
                        <p><strong>Precio Final:</strong> ${data.price} ${data.currency}</p>
                    `;
                })
                .catch(error => {
                    // Manejar errores
                    document.getElementById('result').innerHTML = `<p style="color:red;">Error: ${error.message}</p>`;
                });
        });
    } else {
        console.error("No se encontró el formulario en el DOM.");
    }
});
