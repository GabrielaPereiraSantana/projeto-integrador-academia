// import "../App.css";
// import heroImg from '../assets/gym.png.jpg'


export function Home() {
  return (
   <div className="page">

      <nav className="navbar">
        <div className="logo">
          <span>Y</span>
          <strong>GYM</strong>
        </div>

        <div className="menu">
          <a className="active">Home</a>
          <a>Cadastro</a>
        </div>

      </nav>

      <main className="hero">

        <div className="hero-content">
          <h1>
            ULTRAPASSE SEUS LIMITES <span>EVOLUA</span> A
            <br />
            CADA TREINO
          </h1>

          <p>
            Combine força, flexibilidade e resistência em uma comunidade que valoriza a sua saúde e o crescimento com apoio.
          </p>

          <div className="buttons">
            <button className="start-btn">
              CADASTRE-SE AGORA ↗
            </button>

          </div>
        </div>

      </main>

      <section className="next-section">
        <h2>
          ESCOLHA <span>SEU CAMINHO PARA A BOA FORMA </span>
        </h2>
      </section>

    </div>
  );
}




