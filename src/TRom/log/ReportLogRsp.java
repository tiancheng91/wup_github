// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 3.2.1.4 by WSRD Tencent.
// Generated from `LogReport.jce'
// **********************************************************************

package TRom.log;

public final class ReportLogRsp extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable
{
    public String className()
    {
        return "TRom.ReportLogRsp";
    }

    public String fullClassName()
    {
        return "TRom.ReportLogRsp";
    }

    public int iRetCode = 0;

    public int getIRetCode()
    {
        return iRetCode;
    }

    public void  setIRetCode(int iRetCode)
    {
        this.iRetCode = iRetCode;
    }

    public ReportLogRsp()
    {
    }

    public ReportLogRsp(int iRetCode)
    {
        this.iRetCode = iRetCode;
    }

    public boolean equals(Object o)
    {
        if(o == null)
        {
            return false;
        }

        ReportLogRsp t = (ReportLogRsp) o;
        return (
            com.qq.taf.jce.JceUtil.equals(iRetCode, t.iRetCode) );
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
        _os.write(iRetCode, 0);
    }


    public void readFrom(com.qq.taf.jce.JceInputStream _is)
    {
        this.iRetCode = (int) _is.read(iRetCode, 0, false);
    }

    public void display(java.lang.StringBuilder _os, int _level)
    {
        com.qq.taf.jce.JceDisplayer _ds = new com.qq.taf.jce.JceDisplayer(_os, _level);
        _ds.display(iRetCode, "iRetCode");
    }

    public void displaySimple(java.lang.StringBuilder _os, int _level)
    {
        com.qq.taf.jce.JceDisplayer _ds = new com.qq.taf.jce.JceDisplayer(_os, _level);
        _ds.displaySimple(iRetCode, false);
    }

}
