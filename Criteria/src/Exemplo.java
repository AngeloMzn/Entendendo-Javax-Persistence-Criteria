public class Exemplo {
    
    public List<PtrFoto> buscaArquivoFoto(Patrimonio ptr) {

		Root<PtrFoto> root = createRoot(PtrFoto.class);
		Join<PtrFoto, PtrMovimentacao> joinMvn = root.join("ptrMovimentacao", JoinType.INNER);
		Join<PtrMovimentacao, Patrimonio> joinPtr = joinMvn.join("patrimonio", JoinType.INNER);

		where(builder().equal(joinPtr.get("ptr_Codigo"), ptr.getPtr_Codigo()));
		
		return getResultList();
	}


}
