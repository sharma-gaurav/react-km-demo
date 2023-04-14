import React, {Component} from 'react';
import {MapTo} from '@adobe/aem-react-editable-components';

export const CustomBannerEditConfig = {

    emptyLabel: 'Custom Banner',

    isEmpty: function(props) {
        return !props || !props.title || props.title.trim().length < 1;
    }
};

export default class CustomBanner extends Component {

    render() {
        if(CustomBannerEditConfig.isEmpty(this.props)) {
            return null;
        }

        return (
            <div className="CustomComponent">
                <img src={this.props.imageURL}/>
                <h2 className="CustomComponent__title">{this.props.title}</h2>
            </div>
        );
    }
}

MapTo('wknd-spa-react/components/custom-banner')(CustomBanner, CustomBannerEditConfig);
