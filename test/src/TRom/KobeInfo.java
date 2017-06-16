// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 3.2.1.4 by WSRD Tencent.
// Generated from `KobeshyTest.jce'
// **********************************************************************

package TRom;

public final class KobeInfo extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable
{
    public String className()
    {
        return "TRom.KobeInfo";
    }

    public String fullClassName()
    {
        return "TRom.KobeInfo";
    }

    public int iId = 0;

    public String sName = "";

    public byte sMale = 0;

    public java.util.ArrayList<String> vFavoriteList = null;

    public java.util.Map<Integer, String> mHistory = null;

    public int getIId()
    {
        return iId;
    }

    public void  setIId(int iId)
    {
        this.iId = iId;
    }

    public String getSName()
    {
        return sName;
    }

    public void  setSName(String sName)
    {
        this.sName = sName;
    }

    public byte getSMale()
    {
        return sMale;
    }

    public void  setSMale(byte sMale)
    {
        this.sMale = sMale;
    }

    public java.util.ArrayList<String> getVFavoriteList()
    {
        return vFavoriteList;
    }

    public void  setVFavoriteList(java.util.ArrayList<String> vFavoriteList)
    {
        this.vFavoriteList = vFavoriteList;
    }

    public java.util.Map<Integer, String> getMHistory()
    {
        return mHistory;
    }

    public void  setMHistory(java.util.Map<Integer, String> mHistory)
    {
        this.mHistory = mHistory;
    }

    public KobeInfo()
    {
    }

    public KobeInfo(int iId, String sName, byte sMale, java.util.ArrayList<String> vFavoriteList, java.util.Map<Integer, String> mHistory)
    {
        this.iId = iId;
        this.sName = sName;
        this.sMale = sMale;
        this.vFavoriteList = vFavoriteList;
        this.mHistory = mHistory;
    }

    public boolean equals(Object o)
    {
        if(o == null)
        {
            return false;
        }

        KobeInfo t = (KobeInfo) o;
        return (
            com.qq.taf.jce.JceUtil.equals(iId, t.iId) && 
            com.qq.taf.jce.JceUtil.equals(sName, t.sName) && 
            com.qq.taf.jce.JceUtil.equals(sMale, t.sMale) && 
            com.qq.taf.jce.JceUtil.equals(vFavoriteList, t.vFavoriteList) && 
            com.qq.taf.jce.JceUtil.equals(mHistory, t.mHistory) );
    }

    public int hashCode()
    {
        try
        {
            throw new Exception("Need define key first!");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return 0;
    }
    public java.lang.Object clone()
    {
        java.lang.Object o = null;
        try
        {
            o = super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return o;
    }

    public void writeTo(com.qq.taf.jce.JceOutputStream _os)
    {
        _os.write(iId, 0);
        _os.write(sName, 1);
        _os.write(sMale, 2);
        if (null != vFavoriteList)
        {
            _os.write(vFavoriteList, 3);
        }
        if (null != mHistory)
        {
            _os.write(mHistory, 4);
        }
    }

    static java.util.ArrayList<String> cache_vFavoriteList;
    static java.util.Map<Integer, String> cache_mHistory;

    public void readFrom(com.qq.taf.jce.JceInputStream _is)
    {
        this.iId = (int) _is.read(iId, 0, true);
        this.sName =  _is.readString(1, true);
        this.sMale = (byte) _is.read(sMale, 2, true);
        if(null == cache_vFavoriteList)
        {
            cache_vFavoriteList = new java.util.ArrayList<String>();
            String __var_1 = "";
            ((java.util.ArrayList<String>)cache_vFavoriteList).add(__var_1);
        }
        this.vFavoriteList = (java.util.ArrayList<String>) _is.read(cache_vFavoriteList, 3, false);
        if(null == cache_mHistory)
        {
            cache_mHistory = new java.util.HashMap<Integer, String>();
            Integer __var_2 = 0;
            String __var_3 = "";
            cache_mHistory.put(__var_2, __var_3);
        }
        this.mHistory = (java.util.Map<Integer, String>) _is.read(cache_mHistory, 4, false);
    }

    public void display(java.lang.StringBuilder _os, int _level)
    {
        com.qq.taf.jce.JceDisplayer _ds = new com.qq.taf.jce.JceDisplayer(_os, _level);
        _ds.display(iId, "iId");
        _ds.display(sName, "sName");
        _ds.display(sMale, "sMale");
        _ds.display(vFavoriteList, "vFavoriteList");
        _ds.display(mHistory, "mHistory");
    }

    public void displaySimple(java.lang.StringBuilder _os, int _level)
    {
        com.qq.taf.jce.JceDisplayer _ds = new com.qq.taf.jce.JceDisplayer(_os, _level);
        _ds.displaySimple(iId, true);
        _ds.displaySimple(sName, true);
        _ds.displaySimple(sMale, true);
        _ds.displaySimple(vFavoriteList, true);
        _ds.displaySimple(mHistory, false);
    }

}
