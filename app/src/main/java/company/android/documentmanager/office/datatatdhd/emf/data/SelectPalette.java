// Copyright 2002, FreeHEP.

package company.android.documentmanager.office.datatatdhd.emf.data;

import java.io.IOException;

import company.android.documentmanager.office.datatatdhd.emf.EMFInputStream;
import company.android.documentmanager.office.datatatdhd.emf.EMFRenderer;
import company.android.documentmanager.office.datatatdhd.emf.EMFTag;

/**
 * SelectPalette TAG.
 * 
 * @author Mark Donszelmann
 * @version $Id: SelectPalette.java 10367 2007-01-22 19:26:48Z duns $
 */
public class SelectPalette extends EMFTag
{

    private int index;

    public SelectPalette()
    {
        super(48, 1);
    }

    public SelectPalette(int index)
    {
        this();
        this.index = index;
    }

    public EMFTag read(int tagID, EMFInputStream emf, int len) throws IOException
    {

        return new SelectPalette(emf.readDWORD());
    }

    public String toString()
    {
        return super.toString() + "\n  index: 0x" + Integer.toHexString(index);
    }

    /**
     * displays the tag using the renderer
     *
     *  renderer EMFRenderer storing the drawing session data
     */
    public void render(EMFRenderer renderer)
    {
        // The SelectPalette function selects the specified
        // logical palette into a device context.

        // TODO needs CreatePalette and CreatePalletteIndex to work
    }
}