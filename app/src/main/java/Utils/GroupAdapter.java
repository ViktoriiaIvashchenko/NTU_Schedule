package Utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;

import java.util.ArrayList;
import java.util.List;

public class GroupAdapter extends ArrayAdapter<Group> implements Filterable {
    private List<Group> originalList;
    private List<Group> filteredList;
    private GroupAdapter.GroupFilter groupFilter;

    public GroupAdapter(Context context, List<Group> groupList) {
        super(context, 0, groupList);
        originalList = groupList;
        filteredList = new ArrayList<>(groupList);
        groupFilter = new GroupAdapter.GroupFilter();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Виконайте налаштування вашого елемента списку
        // ...
        return convertView;
    }

    @Override
    public int getCount() {
        return filteredList.size();
    }

    @Override
    public Group getItem(int position) {
        return filteredList.get(position);
    }

    @Override
    public Filter getFilter() {
        return groupFilter;
    }

    private class GroupFilter extends Filter {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            List<Group> filteredValues = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                // Якщо рядок пошуку порожній, поверніть оригінальний список
                filteredValues.addAll(originalList);
            } else {
                // Виконайте фільтрацію на основі рядка пошуку
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (Group group : originalList) {
                    if (group.getGroup_name().toLowerCase().contains(filterPattern)) {
                        filteredValues.add(group);
                    }
                }
            }

            results.values = filteredValues;
            results.count = filteredValues.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            filteredList.clear();
            filteredList.addAll((List<Group>) results.values);
            notifyDataSetChanged();
        }
    }

}
