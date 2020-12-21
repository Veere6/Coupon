package my.android.coupon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdepter extends RecyclerView.Adapter<RecyclerAdepter.ViewHolder> {

String[] percent={"30","40","60","80"};
    String[] rupee={"100","400","500","1000"};
    String[] code={"GOID","SEND","REVF","DJFN"};




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coupon_design,parent,false);
        RecyclerAdepter.ViewHolder viewHolder=new RecyclerAdepter.ViewHolder(view);
        return viewHolder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.percent.setText(percent[position]);
        holder.rupee.setText(rupee[position]);
        holder.code.setText(code[position]);


    }

    // total number of rows
    @Override
    public int getItemCount() {
        return code.length;
    }


    // stores and recycles views as they are scrolled off screen
    public static class ViewHolder extends RecyclerView.ViewHolder {


        TextView percent,rupee,code;


        ViewHolder(View itemView) {
            super(itemView);

            percent=itemView.findViewById(R.id.persent);
            rupee=itemView.findViewById(R.id.rupee);
            code=itemView.findViewById(R.id.code);


        }
    }
}

