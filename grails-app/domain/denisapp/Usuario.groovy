package denisapp

class Usuario {
	String nome
	String login
	String hashSenha
	String email
		
	
	static constraints = {
		nome(nullable:false,blank:false,unique:true)
		login(nullable:false,blank:false,unique:true)
		hashSenha(nullable:false,blank:false)
		email(nullable:false,blank:false,email:true)
	}
}
  

