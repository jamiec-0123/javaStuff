package inheritanceLearnin;

public class Cakes {
	private String _flavour,_event;
	private int _layers;
	public Cakes(String flavour,String event,int layers) 
	{
		SetFlavour(flavour);
		SetEvent(event);
		SetLayers(layers);
	}
	public String GetFlavour()
	{
		return _flavour;
	}
	public void SetFlavour(String Flavour) 
	{
		this._flavour = Flavour;
	}
	public String GetEvent()
	{
		return _event;
	}
	public void SetEvent(String Event) 
	{
		this._event = Event;
	}

	public int GetLayersr()
	{
		return _layers;
	}
	public void SetLayers(int Layers) 
	{
		this._layers = Layers;
	}
	
}
