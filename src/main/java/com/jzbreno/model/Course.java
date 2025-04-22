package com.jzbreno.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//para gerar os getters e setters do encapsulamento, usaremos o lombock inves da criacao comum
//@Getter @Setter tambem poderia usalos, mas o @data faz todos eles e adiciona os contrutores paderao e vazio

@Entity //especificando que sera uma entidade do nosso banco de dados
//@Table(name ="cursos"), nesse caso utilizamos para referenciar tabelas ja existentes
@Data
public class Course {

    @Id //nomeamos o @id como chave primaria do nosso  banco de dados
    @GeneratedValue(strategy = GenerationType.AUTO) //estamos settando para que seja gerado automaticamente cada vez que criarmos um novo curso
    private Long id;
    @Column(name="nome", length = 200, nullable = false)//posso linkar com colunas de outros nomes se necessario
    private String nome;
    @Column(length = 10, nullable = false)
    private String categoria;


}
