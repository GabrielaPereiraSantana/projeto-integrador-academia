package sptech.school.projeto.academia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
@CrossOrigin
public class MatriculaController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping
    public ResponseEntity<List<Matricula>> listar(){
        String sql = "SELECT * FROM alunos";
        List<Matricula> resultado = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Matricula.class));

        return ResponseEntity.status(200).body(resultado);
    };

    @GetMapping("/{id}")
    public ResponseEntity<Matricula> buscarId(@PathVariable Integer id){
        String sql = "SELECT * FROM alunos WHERE id = ?";
        List<Matricula> resultado = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Matricula.class),id);

        if (resultado.isEmpty()) {
            return ResponseEntity.status(404).build();
        }

        return ResponseEntity.status(200).body(resultado.get(0));
    }

    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody Matricula matricula){

        if (matricula.getNome() == null || matricula.getNome().isEmpty()){
            return ResponseEntity.status(400).build();
        }
        if (matricula.getEmail() == null || matricula.getEmail().isEmpty() || matricula.getEmail().length() > 150){
            return ResponseEntity.status(400).build();
        }
        if (matricula.getTelefone() == null || matricula.getTelefone().isEmpty()){
            return ResponseEntity.status(400).build();
        }
        if (matricula.getPlano_escolhido() == null || matricula.getPlano_escolhido().isEmpty()){
            return ResponseEntity.status(400).build();
        }
        if (matricula.getPeso() == null || matricula.getPeso() <= 0.0){
            return ResponseEntity.status(400).build();
        }
        if (matricula.getAltura() == null || matricula.getAltura() <= 0.0) {
            return ResponseEntity.status(400).build();
        }
        String sql = "INSERT INTO alunos(nome, email, telefone, plano_escolhido, peso, altura) VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, matricula.getNome(),matricula.getEmail(),matricula.getTelefone(),matricula.getPlano_escolhido(),matricula.getPeso(),matricula.getAltura());
        return ResponseEntity.status(201).build();

    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizar(@PathVariable Integer id, @RequestBody Matricula matricula){

        if (matricula.getNome() == null || matricula.getNome().isEmpty()){
            return ResponseEntity.status(400).build();
        }
        if (matricula.getEmail() == null || matricula.getEmail().isEmpty() || matricula.getEmail().length() > 150){
            return ResponseEntity.status(400).build();
        }
        if (matricula.getTelefone() == null || matricula.getTelefone().isEmpty()){
            return ResponseEntity.status(400).build();
        }
        if (matricula.getPlano_escolhido() == null || matricula.getPlano_escolhido().isEmpty()){
            return ResponseEntity.status(400).build();
        }
        if (matricula.getPeso() == null || matricula.getPeso() <= 0.0){
            return ResponseEntity.status(400).build();
        }
        if (matricula.getAltura() == null || matricula.getAltura() <= 0.0) {
            return ResponseEntity.status(400).build();
        }
        String sql = "UPDATE alunos SET nome = ?, email = ?, telefone = ?, plano_escolhido = ?, peso = ?, altura = ? WHERE id = ?";
        Integer linhasAlteradas = jdbcTemplate.update(sql, matricula.getNome(),matricula.getEmail(),matricula.getTelefone(),matricula.getPlano_escolhido(),matricula.getPeso(),matricula.getAltura(), id);

        if (linhasAlteradas == 0){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(204).build();
    }

}
