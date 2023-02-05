package alberto;

public class Alberto {
	  public static void main(String[] args) {
	    Alberto alberto = new Alberto();
	    alberto.presentacion();
	    alberto.mostrarHobbies();
	    alberto.misComidasFavoritas();
	    alberto.pruebaFuncionamiento();
	  }


	public void presentacion() {
	    System.out.println("Hola, soy Alberto");
	  }
	
	 public void mostrarHobbies() {
		    System.out.println("Mis hobbies son: ");
		    System.out.println("Leer");
		    System.out.println("Escuchar música");
		    System.out.println("Hacer deporte");
		  }
	
	 public void misComidasFavoritas () {
			System.out.println("Mis 3 comidas favoritas son :  estofado de alubias, pasta(en general), arroz campero ");
			//System.out.println("Las comidas favoritas de Alberto son: cerdo estofado, natillas y helado de chocolate");

			}

		private void pruebaFuncionamiento() {
			System.out.println("Funciona correctamente de nuevo");
			
		}
	 
		}
	
	   
	

