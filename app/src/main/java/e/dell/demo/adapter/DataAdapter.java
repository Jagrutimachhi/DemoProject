package e.dell.demo.adapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import e.dell.demo.R;
import e.dell.demo.model.DataModel;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder>{
    public Context context;
    public List<DataModel> mdata;

    public DataAdapter(Context context, List<DataModel> mdata) {
        this.context = context;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_data_display,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder Holder, int position) {

      Holder.tv_lovevibes.setText(mdata.get(position).getImagetext());
      Holder.img_lovevibes.setImageResource(mdata.get(position).getImageview());

    }

    @Override
    public int getItemCount()
    {
        return mdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img_lovevibes;
        public TextView tv_lovevibes;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_lovevibes=itemView.findViewById(R.id.img_lovevibes);
            tv_lovevibes=itemView.findViewById(R.id.tv_lovevibes);
        }
    }
}
