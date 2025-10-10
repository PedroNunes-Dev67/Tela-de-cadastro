const form = document.getElementById('form');
const resp = document.getElementById('resp');

form.addEventListener("submit", async (e) => {

    e.preventDefault();

    const nomeUsuario = document.getElementById('nome').value;
    const emailUsuario = document.getElementById('email').value;
    const senhaUsuario = document.getElementById('senha').value;

    nomeUsuario.trim();
    emailUsuario.trim();    //Retira algum possivel espaço em branco das extremidades.
    senhaUsuario.trim();

    const novoUsuario = {
        nome : nomeUsuario,
        email : emailUsuario,
        senha : senhaUsuario
    };

    try{
        resp.innerText='Carregando...'
        await axios.post('http://localhost:8080/cadastro/novoUsuario', novoUsuario)
            .then(response => console.log(response.data))
    }
    catch(Error){
        resp.innerText = 'Erro ao cadastrar usuario!';
    }
});