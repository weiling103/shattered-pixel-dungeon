package com.shatteredpixel.shatteredpixeldungeon.items.rings;

/**
 * Created by debenhame on 10/09/2014.
 */
public class RingOfSharpshooting extends Ring {
    //TODO: numbers tweaking, acc logic refactor, does this work with boomerang?
    {
        name = "Ring of Sharpshooting";
    }

    @Override
    protected RingBuff buff( ) {
        return new Aim();
    }

    @Override
    public String desc() {
        return isKnown() ?
                "This ring enhances the wearer's precision and aim, which will " +
                "make all projectile weapons hit harder and last longer. " +
                "A cursed ring will have the opposite effect.":
                super.desc();
    }

    public class Aim extends RingBuff {
    }
}
