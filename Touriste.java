package packpack;

import java.util.ArrayList;

public class Touriste {
	String nom,prenom,nationalité;
	int age;
	ArrayList <String> Pays_visités;
	ArrayList <String> commentaire;
	public Touriste(String nom,String prenom, int age, String nationalité)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.nationalité = nationalité;
		this.Pays_visités = new ArrayList <>();
		this.commentaire = new ArrayList <>();
	}
	void ajouterPays(String p)
	{
		boolean verif=false;
		for(String item: Pays_visités)
		{
			if(item==p)
			{
				verif=true;
				break;
			}
		}
		if(verif==true)
			System.out.println(p+" existe deja dans la liste");
		else
			Pays_visités.add(p);
	}
	void afficherListPays()
	{
		if(Pays_visités.size()>0)
		{
			System.out.println("les pays visités sont: ");
			for(String item : Pays_visités)
			{
				System.out.println(item);
			}
		}
		else
			System.out.println("la liste est vide");
	}
	void laisserCommentaire(String c)
	{
		commentaire.add(c);
	}
	void afficherCommentaire()
	{
		for(String item : commentaire)
		{
			System.out.println(item);
		}
	}
	public static void findout(Touriste t)
	{
		boolean verif1=false;
		boolean verif2=false;
		for(String item: t.Pays_visités)
		{
			if(item=="algerie")
			{
				verif1=true;
				break;
			}
		}
		for(String item: t.commentaire)
		{
			if(item.contains("algerie"))
			{
				verif2=true;
				break;
			}
		}
		if(verif1==true && verif2==true)
			System.out.println("l'algerie fait partie des pays visités");
		else
			System.out.println("l'algerie ne fait pas partie des pays visités");
	}
}
