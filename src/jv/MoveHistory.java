package jv;

class MoveHistory {
    private final int depart;
    private final int arrivee;
    private final String promote;
    private final int histEp;
    private final Piece piecePrise;
    private final boolean hist_roque_56;
    private final boolean hist_roque_63;
    private final boolean isEp;
    private final boolean hist_roque_0;
    private final boolean hist_roque_7;
    // ?? private final Piece pieceDeplacee;

    MoveHistory(int depart, int arrivee, Piece piecePrise,
                boolean isEp, int histEp, String promote,
                boolean hist_roque_56, boolean hist_roque_63, boolean hist_roque_0, boolean hist_roque_7) {
        this.depart = depart;
        this.arrivee = arrivee;
        // ?? this.pieceDeplacee = pieceDeplacee;
        this.piecePrise = piecePrise;
        this.isEp = isEp;
        this.histEp = histEp;
        this.promote = promote;
        this.hist_roque_56 = hist_roque_56;
        this.hist_roque_63 = hist_roque_63;
        this.hist_roque_0 = hist_roque_0;
        this.hist_roque_7 = hist_roque_7;
    }

    int getDepart() {
        return depart;
    }


    int getArrivee() {
        return arrivee;
    }

    String getPromote() {
        return promote;
    }

    int getHistEp() {
        return histEp;
    }

    Piece getPiecePrise() {
        return piecePrise;
    }

    boolean isHist_roque_56() {
        return hist_roque_56;
    }

    boolean isHist_roque_63() {
        return hist_roque_63;
    }

    boolean isEp() {
        return isEp;
    }

    boolean isHist_roque_0() {
        return hist_roque_0;
    }

    boolean isHist_roque_7() {
        return hist_roque_7;
    }
}
