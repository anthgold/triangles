public class Triangle {
  private int mSideX;
  private int mSideY;
  private int mSideZ;

  public Triangle (int sideX, int sideY, int sideZ) {
    mSideX = sideX;
    mSideY = sideY;
    mSideZ = sideZ;
  }

  public String getTriangleType() {
    if (mSideX == mSideY && mSideY == mSideZ) {
      return "equilateral";
    } else {
      return "";
    }
  }

/*  private int mLength;
  private int mWidth;

   public Rectangle(int length, int width) {
     mLength = length;
     mWidth = width;
   }

   public int getLength() {
     return mLength;
   }

   public int getWidth() {
     return mWidth;
   }

   public boolean isSquare() {
     return mLength == mWidth;
   }
   */
}
