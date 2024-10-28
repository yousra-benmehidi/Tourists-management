package packpack;

public class maintest {

	public static void main(String[] args) {
		Touriste t = new Touriste("mohammed","ali",20,"algerien");
		t.ajouterPays("france");
		t.ajouterPays("espagne");
		t.ajouterPays("turquie");
		t.ajouterPays("suisse");
		t.ajouterPays("algerie");
		t.afficherListPays();
		t.laisserCommentaire("tres beau pays a revisiter");
		t.laisserCommentaire("paysage feeriques et eblouissants");
		t.laisserCommentaire("magnifique pays");
		t.afficherCommentaire();
		Touriste.findout(t);
	}
}
