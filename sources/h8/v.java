package h8;

import g8.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.l;

class v extends u {
    public static <T> List<T> A(Iterable<? extends T> iterable) {
        l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return n.g(B(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return n.c();
        }
        if (size != 1) {
            return C(collection);
        }
        return m.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> B(Iterable<? extends T> iterable) {
        l.e(iterable, "<this>");
        return iterable instanceof Collection ? C((Collection) iterable) : (List) z(iterable, new ArrayList());
    }

    public static final <T> List<T> C(Collection<? extends T> collection) {
        l.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> D(Iterable<? extends T> iterable) {
        l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return k0.c((Set) z(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return k0.b();
        }
        if (size != 1) {
            return (Set) z(iterable, new LinkedHashSet(e0.a(collection.size())));
        }
        return j0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static <T, R> List<g8.l<T, R>> E(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        l.e(iterable, "<this>");
        l.e(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(o.i(iterable, 10), o.i(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(p.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> List<T> l(Iterable<? extends T> iterable) {
        l.e(iterable, "<this>");
        return (List) m(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C m(Iterable<? extends T> iterable, C c10) {
        l.e(iterable, "<this>");
        l.e(c10, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c10.add(next);
            }
        }
        return c10;
    }

    public static <T> T n(List<? extends T> list) {
        l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T, A extends Appendable> A o(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, r8.l<? super T, ? extends CharSequence> lVar) {
        l.e(iterable, "<this>");
        l.e(a10, "buffer");
        l.e(charSequence, "separator");
        l.e(charSequence2, "prefix");
        l.e(charSequence3, "postfix");
        l.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (Object next : iterable) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            g.a(a10, next, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static /* synthetic */ Appendable p(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, r8.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return o(iterable, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    public static final <T> String q(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, r8.l<? super T, ? extends CharSequence> lVar) {
        l.e(iterable, "<this>");
        l.e(charSequence, "separator");
        l.e(charSequence2, "prefix");
        l.e(charSequence3, "postfix");
        l.e(charSequence4, "truncated");
        String sb = ((StringBuilder) o(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        l.d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String r(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, r8.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return q(iterable, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    public static <T> T s(List<? extends T> list) {
        l.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(n.d(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T extends Comparable<? super T>> T t(Iterable<? extends T> iterable) {
        l.e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t9 = (Comparable) it.next();
        while (it.hasNext()) {
            T t10 = (Comparable) it.next();
            if (t9.compareTo(t10) > 0) {
                t9 = t10;
            }
        }
        return t9;
    }

    public static <T> List<T> u(Collection<? extends T> collection, T t9) {
        l.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t9);
        return arrayList;
    }

    public static <T> T v(Iterable<? extends T> iterable) {
        l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return w((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T w(List<? extends T> list) {
        l.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static <T> T x(List<? extends T> list) {
        l.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> y(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        l.e(iterable, "<this>");
        l.e(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return A(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            i.g(array, comparator);
            return i.b(array);
        }
        List<T> B = B(iterable);
        r.j(B, comparator);
        return B;
    }

    public static final <T, C extends Collection<? super T>> C z(Iterable<? extends T> iterable, C c10) {
        l.e(iterable, "<this>");
        l.e(c10, "destination");
        for (Object add : iterable) {
            c10.add(add);
        }
        return c10;
    }
}
