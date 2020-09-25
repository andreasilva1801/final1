package br.com.andreacorp.horasextras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity   // a classe usuario é uma entidade armazenavel em banco
	@Table(name="itm232_atividade")  // nome especificao da tabela 

	public class Atividade {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id_atividade")
		private int id_atividade;
		@Column(name="nome_atividade", length=100)
		private String nome_atividade;
		public int getId_atividade() {
			return id_atividade;
		}
		public void setId_atividade(int id_atividade) {
			this.id_atividade = id_atividade;
		}
		public String getNome_atividade() {
			return nome_atividade;
		}
		public void setNome_atividade(String nome_atividade) {
			this.nome_atividade = nome_atividade;
		}
		
		
	}

