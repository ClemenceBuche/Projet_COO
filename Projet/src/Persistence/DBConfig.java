package Persistence;
import java.sql.Connection;
import java.sql.DriverManager;


class DBConfig extends idDB {
    private static DBConfig instance = null;
    private static Connection conn= null;
    
    //constructeur vide
    public DBConfig(){};
    
    //Get Instance
    public static DBConfig getInstance(){
    	 if (instance == null)
             instance = new DBConfig(); 
         return instance;
     }
    
	//GetConnection
	public Connection getConn(){
		if(conn == null){
			try{
				//id et pw sont mes identifiants personnels 
				conn = DriverManager.getConnection(DB_URL,id,pw);
				return conn;
			} catch (Exception e){
				System.out.println("Une erreur s'est produite");
				e.printStackTrace();
				System.exit(1);
			}
		}
		return conn;
	}
    
}
