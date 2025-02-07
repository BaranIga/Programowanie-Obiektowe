package zad_10;

public class BuildingMaterial {
    private String materialType;
    private String qualityGrade;
    private int quantityInStock;

    public BuildingMaterial(String materialType, String qualityGrade, int quantityInStock) {
        this.materialType = materialType;
        this.qualityGrade = qualityGrade;
        this.quantityInStock = quantityInStock;
    }

    public String getMaterialType() {
        return materialType;
    }

    public String getQualityGrade() {
        return qualityGrade;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public static boolean isSufficientQuantity(BuildingMaterial material) {
        if (material == null) {
            return false; // Dla obiektu null zwróć false
        }
        return material.quantityInStock > 100;
    }

    public boolean isSufficientQuantity() {
        return this.quantityInStock > 100;
    }

    @Override
    public String toString() {
        return "BuildingMaterial [materialType=" + materialType + ", qualityGrade=" + qualityGrade + ", quantityInStock=" + quantityInStock + "]";
    }
}
