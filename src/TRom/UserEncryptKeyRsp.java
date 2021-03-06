// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 3.2.1.4 by WSRD Tencent.
// Generated from `/usr/local/app/taf/tafnode/data/Test.GetJceJavaServer/bin//doc/upload/20150813/Security.jce'
// **********************************************************************

package TRom;

public final class UserEncryptKeyRsp extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable
{
    public String className()
    {
        return "TRom.UserEncryptKeyRsp";
    }

    public String fullClassName()
    {
        return "TRom.UserEncryptKeyRsp";
    }

    public String sKey = "";

    public String getSKey()
    {
        return sKey;
    }

    public void  setSKey(String sKey)
    {
        this.sKey = sKey;
    }

    public UserEncryptKeyRsp()
    {
    }

    public UserEncryptKeyRsp(String sKey)
    {
        this.sKey = sKey;
    }

    public boolean equals(Object o)
    {
        if(o == null)
        {
            return false;
        }

        UserEncryptKeyRsp t = (UserEncryptKeyRsp) o;
        return (
            com.qq.taf.jce.JceUtil.equals(sKey, t.sKey) );
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
        if (null != sKey)
        {
            _os.write(sKey, 1);
        }
    }


    public void readFrom(com.qq.taf.jce.JceInputStream _is)
    {
        this.sKey =  _is.readString(1, false);
    }

    public void display(java.lang.StringBuilder _os, int _level)
    {
        com.qq.taf.jce.JceDisplayer _ds = new com.qq.taf.jce.JceDisplayer(_os, _level);
        _ds.display(sKey, "sKey");
    }

    public void displaySimple(java.lang.StringBuilder _os, int _level)
    {
        com.qq.taf.jce.JceDisplayer _ds = new com.qq.taf.jce.JceDisplayer(_os, _level);
        _ds.displaySimple(sKey, false);
    }

}

