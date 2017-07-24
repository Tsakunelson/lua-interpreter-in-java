package interpreterClasses;



//import java.beans.Statement;
import java.beans.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//import Statement;

public class Block
{
	
	private List<Statement> stmts;
	
	public Block ()
	{
		stmts = new ArrayList<Statement>();
	}

	/**
	 * @param stmt cannot be null
	 * @throws IllegalArgumentException if stmt is null
	 */
	public void add(Statement stmt)
	{
		if (stmt == null)
			throw new IllegalArgumentException ("null statement argument");
		stmts.add(stmt);
                
	}
	
	/**
	 * postcondition: every statement in the block has been executed
	 */
	public void execute()
	{
		for (int i = 0; i < stmts.size(); i++)
			try {
                            stmts.get(i).execute();
                    } catch (Exception ex) {
                        Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
                    }
	}
        public String printStmt(){
        String str = "";
            for (int i =0; i<stmts.size(); i++)
               str += stmts.get(i).toString() + "\n";
            return "";
        }
        
}
