document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById("livroForm");
    const listaLivros = document.getElementById("listaLivros");

    // Função para cadastrar um livro
    form.addEventListener("submit", async (event) => {
        event.preventDefault();

        const descricao = document.getElementById("descricao").value;
        const isbn = document.getElementById("isbn").value;

        try {
            const response = await fetch("http://localhost:8080/livros", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json",
                },
                body: JSON.stringify({ descricao, isbn }),
            });

            if (response.ok) {
                alert("Livro cadastrado com sucesso!");
                form.reset();
                listarLivros();
            } else {
                alert("Erro ao cadastrar o livro");
            }
        } catch (error) {
            console.error("Erro ao cadastrar o livro:", error);
        }
    });

    // Função para listar todos os livros
    async function listarLivros() {
        try {
            const response = await fetch("http://localhost:8080/livros");
            const livros = await response.json();

            listaLivros.innerHTML = "";
            livros.forEach((livro) => {
                const li = document.createElement("li");
                li.textContent = `Descrição: ${livro.descricao} - ISBN: ${livro.isbn}`;
                listaLivros.appendChild(li);
            });
        } catch (error) {
            console.error("Erro ao carregar os livros:", error);
        }
    }

    // Carregar a lista de livros ao abrir a página
    listarLivros();
});
