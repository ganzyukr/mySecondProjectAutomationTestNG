package api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

@JsonDeserialize(as = Address.class)
public class Address {
        @JsonProperty("Present")
        public String Present;
        @JsonProperty("Warehouses")
        public int Warehouses;
        @JsonProperty("MainDescription")
        public String MainDescription;
        @JsonProperty("Area")
        public String Area;
        @JsonProperty("Region")
        public String Region;
        @JsonProperty("SettlementTypeCode")
        public String SettlementTypeCode;
        @JsonProperty("Ref")
        public String Ref;
        @JsonProperty("DeliveryCity")
        public String DeliveryCity;
        @JsonProperty("AddressDeliveryAllowed")
        public boolean AddressDeliveryAllowed;
        @JsonProperty("StreetsAvailability")
        public boolean StreetsAvailability;
        @JsonProperty("ParentRegionTypes")
        public String ParentRegionTypes;
        @JsonProperty("ParentRegionCode")
        public String ParentRegionCode;
        @JsonProperty("RegionTypes")
        public String RegionTypes;
        @JsonProperty("RegionTypesCode")
        public String RegionTypesCode;

        @JsonCreator
    public Address(@JsonProperty("Present") String present, @JsonProperty("Warehouses") int warehouses, @JsonProperty("MainDescription") String mainDescription, @JsonProperty("Area") String area, @JsonProperty("Region") String region, @JsonProperty("SettlementTypeCode") String settlementTypeCode, @JsonProperty("Ref") String ref, @JsonProperty("DeliveryCity") String deliveryCity, @JsonProperty("AddressDeliveryAllowed") boolean addressDeliveryAllowed, @JsonProperty("StreetsAvailability") boolean streetsAvailability, @JsonProperty("ParentRegionTypes") String parentRegionTypes, @JsonProperty("ParentRegionCode") String parentRegionCode, @JsonProperty("RegionTypes") String regionTypes, @JsonProperty("RegionTypesCode") String regionTypesCode) {
        this.Present = present;
        this.Warehouses = warehouses;
        this.MainDescription = mainDescription;
        this.Area = area;
        this.Region = region;
        this.SettlementTypeCode = settlementTypeCode;
        this.Ref = ref;
        this.DeliveryCity = deliveryCity;
        this.AddressDeliveryAllowed = addressDeliveryAllowed;
        this.StreetsAvailability = streetsAvailability;
        this.ParentRegionTypes = parentRegionTypes;
        this.ParentRegionCode = parentRegionCode;
        this.RegionTypes = regionTypes;
        this.RegionTypesCode = regionTypesCode;
    }

    @Getter
    public String getPresent() {
        return Present;
    }
    @Setter
    public void setPresent(String present) {
        Present = present;
    }
    @Getter
    public int getWarehouses() {
        return Warehouses;
    }
    @Setter
    public void setWarehouses(int warehouses) {
        Warehouses = warehouses;
    }
    @Getter
    public String getMainDescription() {
        return MainDescription;
    }
    @Setter
    public void setMainDescription(String mainDescription) {
        MainDescription = mainDescription;
    }
    @Getter
    public String getArea() {
        return Area;
    }
    @Setter
    public void setArea(String area) {
        Area = area;
    }
    @Getter
    public String getRegion() {
        return Region;
    }
    @Setter
    public void setRegion(String region) {
        Region = region;
    }
    @Getter
    public String getSettlementTypeCode() {
        return SettlementTypeCode;
    }
    @Setter
    public void setSettlementTypeCode(String settlementTypeCode) {
        SettlementTypeCode = settlementTypeCode;
    }
    @Getter
    public String getRef() {
        return Ref;
    }
    @Setter
    public void setRef(String ref) {
        Ref = ref;
    }
    @Getter
    public String getDeliveryCity() {
        return DeliveryCity;
    }
    @Setter
    public void setDeliveryCity(String deliveryCity) {
        DeliveryCity = deliveryCity;
    }
    @Getter
    public Boolean getAddressDeliveryAllowed() {
        return AddressDeliveryAllowed;
    }
    @Setter
    public void setAddressDeliveryAllowed(Boolean addressDeliveryAllowed) {
        AddressDeliveryAllowed = addressDeliveryAllowed;
    }
    @Getter
    public Boolean getStreetsAvailability() {
        return StreetsAvailability;
    }
    @Setter
    public void setStreetsAvailability(boolean streetsAvailability) {
        StreetsAvailability = streetsAvailability;
    }
    @Getter
    public String getParentRegionTypes() {
        return ParentRegionTypes;
    }
    @Setter
    public void setParentRegionTypes(String parentRegionTypes) {
        ParentRegionTypes = parentRegionTypes;
    }
    @Getter
    public String getParentRegionCode() {
        return ParentRegionCode;
    }
    @Setter
    public void setParentRegionCode(String parentRegionCode) {
        ParentRegionCode = parentRegionCode;
    }
    @Getter
    public String getRegionTypes() {
        return RegionTypes;
    }
    @Setter
    public void setRegionTypes(String regionTypes) {
        RegionTypes = regionTypes;
    }
    @Getter
    public String getRegionTypesCode() {
        return RegionTypesCode;
    }
    @Setter
    public void setRegionTypesCode(String regionTypesCode) {
        RegionTypesCode = regionTypesCode;
    }

    @Override
    public String toString() {
        return "Addreess{" +
                "Present='" + Present + '\'' +
                ", Warehouses=" + Warehouses +
                ", MainDescription='" + MainDescription + '\'' +
                ", Area='" + Area + '\'' +
                ", Region='" + Region + '\'' +
                ", SettlementTypeCode='" + SettlementTypeCode + '\'' +
                ", Ref='" + Ref + '\'' +
                ", DeliveryCity='" + DeliveryCity + '\'' +
                ", AddressDeliveryAllowed=" + AddressDeliveryAllowed +
                ", StreetsAvailability=" + StreetsAvailability +
                ", ParentRegionTypes='" + ParentRegionTypes + '\'' +
                ", ParentRegionCode='" + ParentRegionCode + '\'' +
                ", RegionTypes='" + RegionTypes + '\'' +
                ", RegionTypesCode='" + RegionTypesCode + '\'' +
                '}';
    }
}
