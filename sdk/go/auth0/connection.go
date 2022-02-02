// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With Auth0, you can define sources of users, otherwise known as connections, which may include identity providers (such as Google or LinkedIn), databases, or passwordless authentication methods. This resource allows you to configure and manage connections to be used with your clients and users.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := auth0.NewConnection(ctx, "myConnection", &auth0.ConnectionArgs{
// 			Options: &ConnectionOptionsArgs{
// 				BruteForceProtection: pulumi.Bool(true),
// 				Configuration: pulumi.StringMap{
// 					"bar": pulumi.String("baz"),
// 					"foo": pulumi.String("bar"),
// 				},
// 				CustomScripts: pulumi.StringMap{
// 					"getUser": pulumi.String(fmt.Sprintf("%v%v%v%v", "function getByEmail (email, callback) {\n", "  return callback(new Error(\"Whoops!\"))\n", "}\n", "\n")),
// 				},
// 				EnabledDatabaseCustomization: pulumi.Bool(true),
// 				PasswordHistories: ConnectionOptionsPasswordHistoryArray{
// 					&ConnectionOptionsPasswordHistoryArgs{
// 						Enable: pulumi.Bool(true),
// 						Size:   pulumi.Int(3),
// 					},
// 				},
// 				PasswordPolicy: pulumi.String("excellent"),
// 			},
// 			Strategy: pulumi.String("auth0"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// > The Auth0 dashboard displays only one connection per social provider. Although the Auth0 Management API allowes the creation of multiple connections per strategy, the additional connections may not be visible in the Auth0 dashboard.
type Connection struct {
	pulumi.CustomResourceState

	// Name used in login screen
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// IDs of the clients for which the connection is enabled. If not specified, no clients are enabled.
	EnabledClients pulumi.StringArrayOutput `pulumi:"enabledClients"`
	// Indicates whether or not the connection is domain level.
	IsDomainConnection pulumi.BoolOutput `pulumi:"isDomainConnection"`
	// Name of the connection.
	Name pulumi.StringOutput `pulumi:"name"`
	// Configuration settings for connection options. For details, see Options.
	Options ConnectionOptionsPtrOutput `pulumi:"options"`
	// Defines the realms for which the connection will be used (i.e., email domains). If not specified, the connection name is added as the realm.
	Realms pulumi.StringArrayOutput `pulumi:"realms"`
	// Type of the connection, which indicates the identity provider. Options include `ad`, `adfs`, `amazon`, `aol`, `apple`, `auth0`, `auth0-adldap`, `auth0-oidc`, `baidu`, `bitbucket`, `bitly`, `box`, `custom`, `daccount`, `dropbox`, `dwolla`, `email`, `evernote`, `evernote-sandbox`, `exact`, `facebook`, `fitbit`, `flickr`, `github`, `google-apps`, `google-oauth2`, `guardian`, `instagram`, `ip`, `line`, `linkedin`, `miicard`, `oauth1`, `oauth2`, `office365`, `oidc`, `paypal`, `paypal-sandbox`, `pingfederate`, `planningcenter`, `renren`, `salesforce`, `salesforce-community`, `salesforce-sandbox` `samlp`, `sharepoint`, `shopify`, `sms`, `soundcloud`, `thecity`, `thecity-sandbox`, `thirtysevensignals`, `twitter`, `untappd`, `vkontakte`, `waad`, `weibo`, `windowslive`, `wordpress`, `yahoo`, `yammer`, `yandex`.
	Strategy pulumi.StringOutput `pulumi:"strategy"`
	// Version 1 is deprecated, use version 2.
	StrategyVersion pulumi.StringOutput `pulumi:"strategyVersion"`
	// Validation of the minimum and maximum values allowed for a user to have as username. For details, see Validation.
	Validation pulumi.StringMapOutput `pulumi:"validation"`
}

// NewConnection registers a new resource with the given unique name, arguments, and options.
func NewConnection(ctx *pulumi.Context,
	name string, args *ConnectionArgs, opts ...pulumi.ResourceOption) (*Connection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Strategy == nil {
		return nil, errors.New("invalid value for required argument 'Strategy'")
	}
	var resource Connection
	err := ctx.RegisterResource("auth0:index/connection:Connection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnection gets an existing Connection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionState, opts ...pulumi.ResourceOption) (*Connection, error) {
	var resource Connection
	err := ctx.ReadResource("auth0:index/connection:Connection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connection resources.
type connectionState struct {
	// Name used in login screen
	DisplayName *string `pulumi:"displayName"`
	// IDs of the clients for which the connection is enabled. If not specified, no clients are enabled.
	EnabledClients []string `pulumi:"enabledClients"`
	// Indicates whether or not the connection is domain level.
	IsDomainConnection *bool `pulumi:"isDomainConnection"`
	// Name of the connection.
	Name *string `pulumi:"name"`
	// Configuration settings for connection options. For details, see Options.
	Options *ConnectionOptions `pulumi:"options"`
	// Defines the realms for which the connection will be used (i.e., email domains). If not specified, the connection name is added as the realm.
	Realms []string `pulumi:"realms"`
	// Type of the connection, which indicates the identity provider. Options include `ad`, `adfs`, `amazon`, `aol`, `apple`, `auth0`, `auth0-adldap`, `auth0-oidc`, `baidu`, `bitbucket`, `bitly`, `box`, `custom`, `daccount`, `dropbox`, `dwolla`, `email`, `evernote`, `evernote-sandbox`, `exact`, `facebook`, `fitbit`, `flickr`, `github`, `google-apps`, `google-oauth2`, `guardian`, `instagram`, `ip`, `line`, `linkedin`, `miicard`, `oauth1`, `oauth2`, `office365`, `oidc`, `paypal`, `paypal-sandbox`, `pingfederate`, `planningcenter`, `renren`, `salesforce`, `salesforce-community`, `salesforce-sandbox` `samlp`, `sharepoint`, `shopify`, `sms`, `soundcloud`, `thecity`, `thecity-sandbox`, `thirtysevensignals`, `twitter`, `untappd`, `vkontakte`, `waad`, `weibo`, `windowslive`, `wordpress`, `yahoo`, `yammer`, `yandex`.
	Strategy *string `pulumi:"strategy"`
	// Version 1 is deprecated, use version 2.
	StrategyVersion *string `pulumi:"strategyVersion"`
	// Validation of the minimum and maximum values allowed for a user to have as username. For details, see Validation.
	Validation map[string]string `pulumi:"validation"`
}

type ConnectionState struct {
	// Name used in login screen
	DisplayName pulumi.StringPtrInput
	// IDs of the clients for which the connection is enabled. If not specified, no clients are enabled.
	EnabledClients pulumi.StringArrayInput
	// Indicates whether or not the connection is domain level.
	IsDomainConnection pulumi.BoolPtrInput
	// Name of the connection.
	Name pulumi.StringPtrInput
	// Configuration settings for connection options. For details, see Options.
	Options ConnectionOptionsPtrInput
	// Defines the realms for which the connection will be used (i.e., email domains). If not specified, the connection name is added as the realm.
	Realms pulumi.StringArrayInput
	// Type of the connection, which indicates the identity provider. Options include `ad`, `adfs`, `amazon`, `aol`, `apple`, `auth0`, `auth0-adldap`, `auth0-oidc`, `baidu`, `bitbucket`, `bitly`, `box`, `custom`, `daccount`, `dropbox`, `dwolla`, `email`, `evernote`, `evernote-sandbox`, `exact`, `facebook`, `fitbit`, `flickr`, `github`, `google-apps`, `google-oauth2`, `guardian`, `instagram`, `ip`, `line`, `linkedin`, `miicard`, `oauth1`, `oauth2`, `office365`, `oidc`, `paypal`, `paypal-sandbox`, `pingfederate`, `planningcenter`, `renren`, `salesforce`, `salesforce-community`, `salesforce-sandbox` `samlp`, `sharepoint`, `shopify`, `sms`, `soundcloud`, `thecity`, `thecity-sandbox`, `thirtysevensignals`, `twitter`, `untappd`, `vkontakte`, `waad`, `weibo`, `windowslive`, `wordpress`, `yahoo`, `yammer`, `yandex`.
	Strategy pulumi.StringPtrInput
	// Version 1 is deprecated, use version 2.
	StrategyVersion pulumi.StringPtrInput
	// Validation of the minimum and maximum values allowed for a user to have as username. For details, see Validation.
	Validation pulumi.StringMapInput
}

func (ConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionState)(nil)).Elem()
}

type connectionArgs struct {
	// Name used in login screen
	DisplayName *string `pulumi:"displayName"`
	// IDs of the clients for which the connection is enabled. If not specified, no clients are enabled.
	EnabledClients []string `pulumi:"enabledClients"`
	// Indicates whether or not the connection is domain level.
	IsDomainConnection *bool `pulumi:"isDomainConnection"`
	// Name of the connection.
	Name *string `pulumi:"name"`
	// Configuration settings for connection options. For details, see Options.
	Options *ConnectionOptions `pulumi:"options"`
	// Defines the realms for which the connection will be used (i.e., email domains). If not specified, the connection name is added as the realm.
	Realms []string `pulumi:"realms"`
	// Type of the connection, which indicates the identity provider. Options include `ad`, `adfs`, `amazon`, `aol`, `apple`, `auth0`, `auth0-adldap`, `auth0-oidc`, `baidu`, `bitbucket`, `bitly`, `box`, `custom`, `daccount`, `dropbox`, `dwolla`, `email`, `evernote`, `evernote-sandbox`, `exact`, `facebook`, `fitbit`, `flickr`, `github`, `google-apps`, `google-oauth2`, `guardian`, `instagram`, `ip`, `line`, `linkedin`, `miicard`, `oauth1`, `oauth2`, `office365`, `oidc`, `paypal`, `paypal-sandbox`, `pingfederate`, `planningcenter`, `renren`, `salesforce`, `salesforce-community`, `salesforce-sandbox` `samlp`, `sharepoint`, `shopify`, `sms`, `soundcloud`, `thecity`, `thecity-sandbox`, `thirtysevensignals`, `twitter`, `untappd`, `vkontakte`, `waad`, `weibo`, `windowslive`, `wordpress`, `yahoo`, `yammer`, `yandex`.
	Strategy string `pulumi:"strategy"`
	// Version 1 is deprecated, use version 2.
	StrategyVersion *string `pulumi:"strategyVersion"`
	// Validation of the minimum and maximum values allowed for a user to have as username. For details, see Validation.
	Validation map[string]string `pulumi:"validation"`
}

// The set of arguments for constructing a Connection resource.
type ConnectionArgs struct {
	// Name used in login screen
	DisplayName pulumi.StringPtrInput
	// IDs of the clients for which the connection is enabled. If not specified, no clients are enabled.
	EnabledClients pulumi.StringArrayInput
	// Indicates whether or not the connection is domain level.
	IsDomainConnection pulumi.BoolPtrInput
	// Name of the connection.
	Name pulumi.StringPtrInput
	// Configuration settings for connection options. For details, see Options.
	Options ConnectionOptionsPtrInput
	// Defines the realms for which the connection will be used (i.e., email domains). If not specified, the connection name is added as the realm.
	Realms pulumi.StringArrayInput
	// Type of the connection, which indicates the identity provider. Options include `ad`, `adfs`, `amazon`, `aol`, `apple`, `auth0`, `auth0-adldap`, `auth0-oidc`, `baidu`, `bitbucket`, `bitly`, `box`, `custom`, `daccount`, `dropbox`, `dwolla`, `email`, `evernote`, `evernote-sandbox`, `exact`, `facebook`, `fitbit`, `flickr`, `github`, `google-apps`, `google-oauth2`, `guardian`, `instagram`, `ip`, `line`, `linkedin`, `miicard`, `oauth1`, `oauth2`, `office365`, `oidc`, `paypal`, `paypal-sandbox`, `pingfederate`, `planningcenter`, `renren`, `salesforce`, `salesforce-community`, `salesforce-sandbox` `samlp`, `sharepoint`, `shopify`, `sms`, `soundcloud`, `thecity`, `thecity-sandbox`, `thirtysevensignals`, `twitter`, `untappd`, `vkontakte`, `waad`, `weibo`, `windowslive`, `wordpress`, `yahoo`, `yammer`, `yandex`.
	Strategy pulumi.StringInput
	// Version 1 is deprecated, use version 2.
	StrategyVersion pulumi.StringPtrInput
	// Validation of the minimum and maximum values allowed for a user to have as username. For details, see Validation.
	Validation pulumi.StringMapInput
}

func (ConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionArgs)(nil)).Elem()
}

type ConnectionInput interface {
	pulumi.Input

	ToConnectionOutput() ConnectionOutput
	ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput
}

func (*Connection) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (i *Connection) ToConnectionOutput() ConnectionOutput {
	return i.ToConnectionOutputWithContext(context.Background())
}

func (i *Connection) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionOutput)
}

// ConnectionArrayInput is an input type that accepts ConnectionArray and ConnectionArrayOutput values.
// You can construct a concrete instance of `ConnectionArrayInput` via:
//
//          ConnectionArray{ ConnectionArgs{...} }
type ConnectionArrayInput interface {
	pulumi.Input

	ToConnectionArrayOutput() ConnectionArrayOutput
	ToConnectionArrayOutputWithContext(context.Context) ConnectionArrayOutput
}

type ConnectionArray []ConnectionInput

func (ConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (i ConnectionArray) ToConnectionArrayOutput() ConnectionArrayOutput {
	return i.ToConnectionArrayOutputWithContext(context.Background())
}

func (i ConnectionArray) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionArrayOutput)
}

// ConnectionMapInput is an input type that accepts ConnectionMap and ConnectionMapOutput values.
// You can construct a concrete instance of `ConnectionMapInput` via:
//
//          ConnectionMap{ "key": ConnectionArgs{...} }
type ConnectionMapInput interface {
	pulumi.Input

	ToConnectionMapOutput() ConnectionMapOutput
	ToConnectionMapOutputWithContext(context.Context) ConnectionMapOutput
}

type ConnectionMap map[string]ConnectionInput

func (ConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (i ConnectionMap) ToConnectionMapOutput() ConnectionMapOutput {
	return i.ToConnectionMapOutputWithContext(context.Background())
}

func (i ConnectionMap) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionMapOutput)
}

type ConnectionOutput struct{ *pulumi.OutputState }

func (ConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (o ConnectionOutput) ToConnectionOutput() ConnectionOutput {
	return o
}

func (o ConnectionOutput) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return o
}

type ConnectionArrayOutput struct{ *pulumi.OutputState }

func (ConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (o ConnectionArrayOutput) ToConnectionArrayOutput() ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) Index(i pulumi.IntInput) ConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].([]*Connection)[vs[1].(int)]
	}).(ConnectionOutput)
}

type ConnectionMapOutput struct{ *pulumi.OutputState }

func (ConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (o ConnectionMapOutput) ToConnectionMapOutput() ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) MapIndex(k pulumi.StringInput) ConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].(map[string]*Connection)[vs[1].(string)]
	}).(ConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionInput)(nil)).Elem(), &Connection{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionArrayInput)(nil)).Elem(), ConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionMapInput)(nil)).Elem(), ConnectionMap{})
	pulumi.RegisterOutputType(ConnectionOutput{})
	pulumi.RegisterOutputType(ConnectionArrayOutput{})
	pulumi.RegisterOutputType(ConnectionMapOutput{})
}
