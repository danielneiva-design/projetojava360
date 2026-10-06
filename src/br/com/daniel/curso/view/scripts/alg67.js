const frm = document.getElementById("form");
const res = document.querySelector("h5");

frm.addEventListener("submit", (e) => {
    e.preventDefault();
    const nome = frm.nome.value;
    res.textContent = `Alô, ${nome}!`;
    e.preventDefault();
});
