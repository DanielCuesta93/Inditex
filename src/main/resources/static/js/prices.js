// Función que maneja el envío del formulario y muestra los resultados sin recargar la página
document.getElementById('priceForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Evitar el envío normal del formulario

    const fechaConsulta = document.getElementById('fechaConsulta').value;
    const productoId = document.getElementById('productoId').value;
    const marcaId = document.getElementById('marcaId').value;

    // Construir la URL con los parámetros de consulta
    const url = `/api/price?fechaConsulta=${fechaConsulta}&productoId=${productoId}&marcaId=${marcaId}`;

    // Hacer la solicitud GET
    fetch(url)
        .then(response => {
            if (response.ok) {
                return response.json();
            } else {
                throw new Error('No se encontraron resultados');
            }
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
                <p><strong>Precio Final:</strong> ${data.price}</p>
            `;
        })
        .catch(error => {
            // Manejar errores
            const resultDiv = document.getElementById('result');
            resultDiv.innerHTML = `<p>Error: ${error.message}</p>`;
        });
});
