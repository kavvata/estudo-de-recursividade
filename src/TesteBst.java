import ifpr.pgua.eic.bst.estrutura.*;
import ifpr.pgua.eic.bst.modelos.*;

public class TesteBst {
    public static void main( String[] args ) {
        BsArvore arvore = new BsArvore();
        
        Aluno[] alunos = {
            new Aluno(1, "Gabriel", new Data(26, 10, 2000)),
            new Aluno(2, "Matheus", new Data(1, 3, 1999)),
            new Aluno(3, "João", new Data(20, 10, 2001)),
            new Aluno(4, "Nicolas", new Data(29, 10, 2000))
        };
        
        for (Aluno aluno : alunos) {
            arvore.insert(new BstNode(aluno));
        }
        
        System.out.println(arvore.search(3).getAluno());

        arvore.delete(3);
        try {
            System.out.println(arvore.search(3).getAluno());
        } catch (NullPointerException e) {
            System.out.println("Aluno não cadastrado.");
        }
        
    }
}
