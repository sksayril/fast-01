package q6;

import com.amazonaws.regions.Regions;
import kotlin.jvm.internal.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private Regions f12023a;

    public e(String str) {
        l.e(str, "regionAsPerPlugin");
        this.f12023a = a(str);
    }

    private final Regions a(String str) {
        switch (str.hashCode()) {
            case -1924809856:
                if (str.equals("SA_EAST_1")) {
                    return Regions.SA_EAST_1;
                }
                break;
            case -1696516593:
                if (str.equals("AP_SOUTH_1")) {
                    return Regions.AP_SOUTH_1;
                }
                break;
            case -1446286600:
                if (str.equals("EU_CENTRAL_1")) {
                    return Regions.EU_CENTRAL_1;
                }
                break;
            case -1374764016:
                if (str.equals("EU_WEST_1")) {
                    return Regions.EU_WEST_1;
                }
                break;
            case -1374764015:
                if (str.equals("EU_WEST_2")) {
                    return Regions.EU_WEST_2;
                }
                break;
            case -1374764014:
                if (str.equals("EU_WEST_3")) {
                    return Regions.EU_WEST_3;
                }
                break;
            case -1352548744:
                if (str.equals("ME_SOUTH_1")) {
                    return Regions.ME_SOUTH_1;
                }
                break;
            case -125163226:
                if (str.equals("CA_CENTRAL_1")) {
                    return Regions.CA_CENTRAL_1;
                }
                break;
            case 61063472:
                if (str.equals("US_EAST_1")) {
                    return Regions.US_EAST_1;
                }
                break;
            case 61063473:
                if (str.equals("US_EAST_2")) {
                    return Regions.US_EAST_2;
                }
                break;
            case 282333260:
                if (str.equals("AP_SOUTHEAST_1")) {
                    return Regions.AP_SOUTHEAST_1;
                }
                break;
            case 282333261:
                if (str.equals("AP_SOUTHEAST_2")) {
                    return Regions.AP_SOUTHEAST_2;
                }
                break;
            case 580082274:
                if (str.equals("US_WEST_1")) {
                    return Regions.US_WEST_1;
                }
                break;
            case 580082275:
                if (str.equals("US_WEST_2")) {
                    return Regions.US_WEST_2;
                }
                break;
            case 892625985:
                if (str.equals("us-gov-west-1")) {
                    return Regions.GovCloud;
                }
                break;
            case 916950655:
                if (str.equals("AP_EAST_1")) {
                    return Regions.AP_EAST_1;
                }
                break;
            case 1219737288:
                if (str.equals("EU_NORTH_1")) {
                    return Regions.EU_NORTH_1;
                }
                break;
            case 1380043651:
                if (str.equals("CN_NORTH_1")) {
                    return Regions.CN_NORTH_1;
                }
                break;
            case 1804551556:
                if (str.equals("AP_NORTHEAST_1")) {
                    return Regions.AP_NORTHEAST_1;
                }
                break;
            case 1804551557:
                if (str.equals("AP_NORTHEAST_2")) {
                    return Regions.AP_NORTHEAST_2;
                }
                break;
            case 1899259122:
                if (str.equals("CN_NORTHWEST_1")) {
                    return Regions.CN_NORTHWEST_1;
                }
                break;
            case 1929587105:
                if (str.equals("US_GOV_EAST_1")) {
                    return Regions.US_GOV_EAST_1;
                }
                break;
        }
        Regions regions = Regions.DEFAULT_REGION;
        l.d(regions, "DEFAULT_REGION");
        return regions;
    }

    public final Regions b() {
        return this.f12023a;
    }
}
