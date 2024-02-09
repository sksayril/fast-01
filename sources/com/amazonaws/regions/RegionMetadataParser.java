package com.amazonaws.regions;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@Deprecated
public class RegionMetadataParser {
    private static void a(Region region, Element element, boolean z9) {
        String b10 = b("ServiceName", element);
        String b11 = b("Hostname", element);
        String b12 = b("Http", element);
        String b13 = b("Https", element);
        if (!z9 || f(b11)) {
            region.h().put(b10, b11);
            region.b().put(b10, Boolean.valueOf("true".equals(b12)));
            region.c().put(b10, Boolean.valueOf("true".equals(b13)));
            return;
        }
        throw new IllegalStateException("Invalid service endpoint (" + b11 + ") is detected.");
    }

    private static String b(String str, Element element) {
        Node item = element.getElementsByTagName(str).item(0);
        if (item == null) {
            return null;
        }
        return item.getChildNodes().item(0).getNodeValue();
    }

    private static List<Region> c(InputStream inputStream, boolean z9) {
        try {
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            NodeList elementsByTagName = parse.getElementsByTagName("Region");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
                Node item = elementsByTagName.item(i10);
                if (item.getNodeType() == 1) {
                    arrayList.add(d((Element) item, z9));
                }
            }
            return arrayList;
        } catch (IOException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new IOException("Unable to parse region metadata file: " + e11.getMessage(), e11);
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static Region d(Element element, boolean z9) {
        Region region = new Region(b("Name", element), b("Domain", element));
        NodeList elementsByTagName = element.getElementsByTagName("Endpoint");
        for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
            a(region, (Element) elementsByTagName.item(i10), z9);
        }
        return region;
    }

    private static boolean f(String str) {
        return str.endsWith(".amazonaws.com");
    }

    @Deprecated
    public List<Region> e(InputStream inputStream) {
        return c(inputStream, false);
    }
}
