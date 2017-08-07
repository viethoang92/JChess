/**
 * Created by Viet on 5/22/2017.
 */
public abstract class Tile {

    int tileCoordinate;

    Tile(int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();
}
