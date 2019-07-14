package e.dell.demo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import e.dell.demo.adapter.DataAdapter;
import e.dell.demo.model.DataModel;


public class Dashboard_activity extends AppCompatActivity {

    List<DataModel> dataModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);
        dataModelList=new ArrayList<>();
        dataModelList.add(new DataModel("Relationship",R.drawable.ic_icn_relationship));
        dataModelList.add(new DataModel("Breackup&Moving",R.drawable.ic_breakupmoving));
        dataModelList.add(new DataModel("Love",R.drawable.ic_icn_love));
        dataModelList.add(new DataModel("Quates For Him",R.drawable.ic_icn_quotes_for_him));
        dataModelList.add(new DataModel("Quates For Her",R.drawable.ic_icn_quotes_for_her));
        dataModelList.add(new DataModel("Relatable Quotes",R.drawable.ic_icn_relatable_quotes));
        dataModelList.add(new DataModel("Felling Quotes",R.drawable.ic_icn_feeling_quotes));
        dataModelList.add(new DataModel("It's My Life Quotes",R.drawable.ic_icn_its_my_life));
        dataModelList.add(new DataModel("Fitness Quotes",R.drawable.ic_icn_fitness_quotes));
        dataModelList.add(new DataModel("Inspirational Quotes",R.drawable.ic_icn_inspirational_quotes));

        RecyclerView myrv=(RecyclerView)findViewById(R.id.rvStatusList);
        DataAdapter myadapter=new DataAdapter(this,dataModelList);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myadapter);

    }
}
