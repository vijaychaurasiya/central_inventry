package com.example.demo.dto;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ProductDTO {
    private int id;
	private String name;
    private String slug;
    private String permalink;
    private String date_created;
    private String date_created_gmt;
    private String date_modified;
    private String date_modified_gmt;
    private String type;
    private String status;
    private boolean featured;
    private String catalog_visibility;
    private String description;
    private String short_description;
    private String sku;
    private String price;
    private String regular_price;
    private String sale_price;
    private String date_on_sale_from;
    private String date_on_sale_from_gmt;
    private String date_on_sale_to;
    private String date_on_sale_to_gmt;
    private boolean on_sale;
    private boolean purchasable;
    private int total_sales;
    private boolean virtual;
    private boolean downloadable;
    private List<String> downloads;
    private int download_limit;
    private int download_expiry;
    private String external_url;
    private String button_text;
    private String tax_status;
    private String tax_class;
    private boolean manage_stock;
    private Integer stock_quantity;
    private String backorders;
    private boolean backorders_allowed;
    private boolean backordered;
    private Integer low_stock_amount;
    private boolean sold_individually;
    private String weight;
    private Map<String, String> dimensions;
    private boolean shipping_required;
    private boolean shipping_taxable;
    private String shipping_class;
    private int shipping_class_id;
    private boolean reviews_allowed;
    private String average_rating;
    private int rating_count;
    private List<Integer> upsell_ids;
    private List<Integer> cross_sell_ids;
    private int parent_id;
    private String purchase_note;
    private List<Category> categories;
    private List<String> tags;
    private List<Object> images;
    private List<Object> attributes;
    private List<Object> default_attributes;
    private List<Object> variations;
    private List<Object> grouped_products;
    private int menu_order;
    private String price_html;
    private List<Integer> related_ids;
    private List<Object> meta_data;
    private String stock_status;
    private boolean has_options;
    private Links _links;

    // Add getters and setters for all fields
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	public String getDate_created_gmt() {
		return date_created_gmt;
	}

	public void setDate_created_gmt(String date_created_gmt) {
		this.date_created_gmt = date_created_gmt;
	}

	public String getDate_modified() {
		return date_modified;
	}

	public void setDate_modified(String date_modified) {
		this.date_modified = date_modified;
	}

	public String getDate_modified_gmt() {
		return date_modified_gmt;
	}

	public void setDate_modified_gmt(String date_modified_gmt) {
		this.date_modified_gmt = date_modified_gmt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isFeatured() {
		return featured;
	}

	public void setFeatured(boolean featured) {
		this.featured = featured;
	}

	public String getCatalog_visibility() {
		return catalog_visibility;
	}

	public void setCatalog_visibility(String catalog_visibility) {
		this.catalog_visibility = catalog_visibility;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getShort_description() {
		return short_description;
	}

	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRegular_price() {
		return regular_price;
	}

	public void setRegular_price(String regular_price) {
		this.regular_price = regular_price;
	}

	public String getSale_price() {
		return sale_price;
	}

	public void setSale_price(String sale_price) {
		this.sale_price = sale_price;
	}

	public String getDate_on_sale_from() {
		return date_on_sale_from;
	}

	public void setDate_on_sale_from(String date_on_sale_from) {
		this.date_on_sale_from = date_on_sale_from;
	}

	public String getDate_on_sale_from_gmt() {
		return date_on_sale_from_gmt;
	}

	public void setDate_on_sale_from_gmt(String date_on_sale_from_gmt) {
		this.date_on_sale_from_gmt = date_on_sale_from_gmt;
	}

	public String getDate_on_sale_to() {
		return date_on_sale_to;
	}

	public void setDate_on_sale_to(String date_on_sale_to) {
		this.date_on_sale_to = date_on_sale_to;
	}

	public String getDate_on_sale_to_gmt() {
		return date_on_sale_to_gmt;
	}

	public void setDate_on_sale_to_gmt(String date_on_sale_to_gmt) {
		this.date_on_sale_to_gmt = date_on_sale_to_gmt;
	}

	public boolean isOn_sale() {
		return on_sale;
	}

	public void setOn_sale(boolean on_sale) {
		this.on_sale = on_sale;
	}

	public boolean isPurchasable() {
		return purchasable;
	}

	public void setPurchasable(boolean purchasable) {
		this.purchasable = purchasable;
	}

	public int getTotal_sales() {
		return total_sales;
	}

	public void setTotal_sales(int total_sales) {
		this.total_sales = total_sales;
	}

	public boolean isVirtual() {
		return virtual;
	}

	public void setVirtual(boolean virtual) {
		this.virtual = virtual;
	}

	public boolean isDownloadable() {
		return downloadable;
	}

	public void setDownloadable(boolean downloadable) {
		this.downloadable = downloadable;
	}

	public List<String> getDownloads() {
		return downloads;
	}

	public void setDownloads(List<String> downloads) {
		this.downloads = downloads;
	}

	public int getDownload_limit() {
		return download_limit;
	}

	public void setDownload_limit(int download_limit) {
		this.download_limit = download_limit;
	}

	public int getDownload_expiry() {
		return download_expiry;
	}

	public void setDownload_expiry(int download_expiry) {
		this.download_expiry = download_expiry;
	}

	public String getExternal_url() {
		return external_url;
	}

	public void setExternal_url(String external_url) {
		this.external_url = external_url;
	}

	public String getButton_text() {
		return button_text;
	}

	public void setButton_text(String button_text) {
		this.button_text = button_text;
	}

	public String getTax_status() {
		return tax_status;
	}

	public void setTax_status(String tax_status) {
		this.tax_status = tax_status;
	}

	public String getTax_class() {
		return tax_class;
	}

	public void setTax_class(String tax_class) {
		this.tax_class = tax_class;
	}

	public boolean isManage_stock() {
		return manage_stock;
	}

	public void setManage_stock(boolean manage_stock) {
		this.manage_stock = manage_stock;
	}

	public Integer getStock_quantity() {
		return stock_quantity;
	}

	public void setStock_quantity(Integer stock_quantity) {
		this.stock_quantity = stock_quantity;
	}

	public String getBackorders() {
		return backorders;
	}

	public void setBackorders(String backorders) {
		this.backorders = backorders;
	}

	public boolean isBackorders_allowed() {
		return backorders_allowed;
	}

	public void setBackorders_allowed(boolean backorders_allowed) {
		this.backorders_allowed = backorders_allowed;
	}

	public boolean isBackordered() {
		return backordered;
	}

	public void setBackordered(boolean backordered) {
		this.backordered = backordered;
	}

	public Integer getLow_stock_amount() {
		return low_stock_amount;
	}

	public void setLow_stock_amount(Integer low_stock_amount) {
		this.low_stock_amount = low_stock_amount;
	}

	public boolean isSold_individually() {
		return sold_individually;
	}

	public void setSold_individually(boolean sold_individually) {
		this.sold_individually = sold_individually;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Map<String, String> getDimensions() {
		return dimensions;
	}

	public void setDimensions(Map<String, String> dimensions) {
		this.dimensions = dimensions;
	}

	public boolean isShipping_required() {
		return shipping_required;
	}

	public void setShipping_required(boolean shipping_required) {
		this.shipping_required = shipping_required;
	}

	public boolean isShipping_taxable() {
		return shipping_taxable;
	}

	public void setShipping_taxable(boolean shipping_taxable) {
		this.shipping_taxable = shipping_taxable;
	}

	public String getShipping_class() {
		return shipping_class;
	}

	public void setShipping_class(String shipping_class) {
		this.shipping_class = shipping_class;
	}

	public int getShipping_class_id() {
		return shipping_class_id;
	}

	public void setShipping_class_id(int shipping_class_id) {
		this.shipping_class_id = shipping_class_id;
	}

	public boolean isReviews_allowed() {
		return reviews_allowed;
	}

	public void setReviews_allowed(boolean reviews_allowed) {
		this.reviews_allowed = reviews_allowed;
	}

	public String getAverage_rating() {
		return average_rating;
	}

	public void setAverage_rating(String average_rating) {
		this.average_rating = average_rating;
	}

	public int getRating_count() {
		return rating_count;
	}

	public void setRating_count(int rating_count) {
		this.rating_count = rating_count;
	}

	public List<Integer> getUpsell_ids() {
		return upsell_ids;
	}

	public void setUpsell_ids(List<Integer> upsell_ids) {
		this.upsell_ids = upsell_ids;
	}

	public List<Integer> getCross_sell_ids() {
		return cross_sell_ids;
	}

	public void setCross_sell_ids(List<Integer> cross_sell_ids) {
		this.cross_sell_ids = cross_sell_ids;
	}

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public String getPurchase_note() {
		return purchase_note;
	}

	public void setPurchase_note(String purchase_note) {
		this.purchase_note = purchase_note;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<Object> getImages() {
		return images;
	}

	public void setImages(List<Object> images) {
		this.images = images;
	}

	public List<Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Object> attributes) {
		this.attributes = attributes;
	}

	public List<Object> getDefault_attributes() {
		return default_attributes;
	}

	public void setDefault_attributes(List<Object> default_attributes) {
		this.default_attributes = default_attributes;
	}

	public List<Object> getVariations() {
		return variations;
	}

	public void setVariations(List<Object> variations) {
		this.variations = variations;
	}

	public List<Object> getGrouped_products() {
		return grouped_products;
	}

	public void setGrouped_products(List<Object> grouped_products) {
		this.grouped_products = grouped_products;
	}

	public int getMenu_order() {
		return menu_order;
	}

	public void setMenu_order(int menu_order) {
		this.menu_order = menu_order;
	}

	public String getPrice_html() {
		return price_html;
	}

	public void setPrice_html(String price_html) {
		this.price_html = price_html;
	}

	public List<Integer> getRelated_ids() {
		return related_ids;
	}

	public void setRelated_ids(List<Integer> related_ids) {
		this.related_ids = related_ids;
	}

	public List<Object> getMeta_data() {
		return meta_data;
	}

	public void setMeta_data(List<Object> meta_data) {
		this.meta_data = meta_data;
	}

	public String getStock_status() {
		return stock_status;
	}

	public void setStock_status(String stock_status) {
		this.stock_status = stock_status;
	}

	public boolean isHas_options() {
		return has_options;
	}

	public void setHas_options(boolean has_options) {
		this.has_options = has_options;
	}

	public Links get_links() {
		return _links;
	}

	public void set_links(Links _links) {
		this._links = _links;
	}

    public static class Category {
        private int id;
		private String name;
        private String slug;
        
        public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSlug() {
			return slug;
		}
		public void setSlug(String slug) {
			this.slug = slug;
		}

        // Add getters and setters for category fields
    }

    public static class Links {
        private List<Self> self;
        private List<Collection> collection;

        // Add getters and setters for links fields
        public List<Self> getSelf() {
			return self;
		}

		public void setSelf(List<Self> self) {
			this.self = self;
		}

		public List<Collection> getCollection() {
			return collection;
		}

		public void setCollection(List<Collection> collection) {
			this.collection = collection;
		}

        public static class Self {
            private String href;

			public String getHref() {
				return href;
			}

			public void setHref(String href) {
				this.href = href;
			}

            // Add getters and setters for self fields
        }

        public static class Collection {
            public String getHref() {
				return href;
			}

			public void setHref(String href) {
				this.href = href;
			}

			private String href;

            // Add getters and setters for collection fields
        }

		
    }
}
